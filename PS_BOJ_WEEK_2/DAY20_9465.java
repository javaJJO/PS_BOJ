import java.io.*;
import java.util.*;

public class DAY20_9465 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] dp = new int[2][n + 1];
			int max = 0;
			int sum = 0;
			int a = 0;
			int b = 0;

			// 2행 n열의 숫자 입력받기(0부터 100까지의 점수범위는 어떻게 설정하지?)
			
				for (int k = 0; k < n; k++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					dp[0][k] = Integer.parseInt(st.nextToken());
				}
				for (int k = 0; k < n; k++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					dp[1][k] = Integer.parseInt(st.nextToken());
				}
			
			int num = n/2;
			while(num==0) {
			
			// 크기비교해서 max값 찾기
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < n; k++) {
					if (max > dp[j][k]) {
						max = dp[j][k] = dp[a][b]; //max 값 저장
					}
				}
			}
			sum = max;
			
			 //max와 바로 위(혹은 아래) 초기화 
			dp[0][b] = 0;
			dp[1][b] = 0;

			if(b==0) {
				dp[a][1] = 0; // max 오른쪽 초기화
			} else if (b==n-1) {
				dp[a][n-2] = 0; // max 왼쪽 초기화
			}else {
				dp[a][b-1] = 0; // max 왼쪽 초기화
				dp[a][b+1] = 0; // max 오른쪽 초기화
			}
			 num--;
			}
			
				
			bw.write(sum);
		}
		br.close();
		bw.flush();
		bw.close();
	}
}