import java.io.*;
public class DAY6_11727 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int [1001]; //입력범위값을 n+1이라고 하지말고 1001
		dp[1]=1;
		dp[2]=3;
		for (int i=3; i<=n;i++) {
				dp[i]=(2*dp[i-2])+dp[i-1];
				dp[i] %= 10007;
		}
		bw.write(dp[n]+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}