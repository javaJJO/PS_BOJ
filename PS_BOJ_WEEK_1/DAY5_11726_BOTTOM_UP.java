import java.io.*;

public class DAY5_11726_BOTTOM_UP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] dp = new int [n+1];
		dp[0]=1; 
		// 공집합도 1개, 빈 스트링도 1개, 그러므로 없는 사각형이지만 1개로 구분
		dp[1]=1;
		for (int i=2; i<=n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			dp[i] %= 10007; 
		}
		bw.write(dp[n] + "\n");
		br.close();
		bw.flush();
		bw.close();
	}
}