import java.io.*;

public class DAY19_11057_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long [][] dp = new long [N+1][10];
		long sum=0;
		
		//N=1일 때(숫자가 한자리일 때)
		for (int j=0; j<=9;j++) {
			dp[1][j]=1;
		}
		
		for(int i=2; i<=N; i++) {
			for (int j=0; j<=9; j++) {
				for(int k=j; k<=9; k++) {
					dp[i][j]+=dp[i-1][k]%10007;
				}
			}
		}
		
		for(int j=0; j<=9; j++) {
			sum = sum+dp[N][j];
		}
		bw.write(String.valueOf(sum%10007));
		br.close();
		bw.flush();
		bw.close();
	}
}