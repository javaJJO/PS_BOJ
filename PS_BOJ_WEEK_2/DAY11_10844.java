import java.io.*;

public class DAY11_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N + 1][10];
		
		dp[1][0]=0;// 0으로 시작하는 경우는 없음
		
		//i(N이)가 1일 때(한자리수 일때) 
		for (int j = 1; j < 10; j++) { 
			//여기서 j는 자릿수
			dp[1][j] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) { //자릿값이 0인 경우
					dp[i][j] = dp[i - 1][j+1]%1000000000;
				}
				else if (j == 9) { //자릿값이 9인 경우
					dp[i][j] += dp[i - 1][j-1]%1000000000;
				}
				else { //그 이외의 경우
					dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
				}
			}
		}
		long sum = 0; //경우의 수를 더해준다
		for (int j = 0; j < 10; j++) { 
			sum = (sum + dp[N][j]);
		}
		bw.write(String.valueOf(sum%1000000000));
		br.close();
		bw.flush();
		bw.close();
	}
}