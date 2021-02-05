import java.io.*;
public class DAY6_10844 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N =Integer.parseInt(br.readLine());
		int[] dp = new int [101];
		dp[1]=9;
		for(int i=2; i<=N; i++) {
			dp[i]=(2*dp[i-1])-1;
			dp[i] = dp[i]%1000000000;
		}
		bw.write(dp[N]);
		br.close();
		bw.flush();
		bw.close();
	}
}