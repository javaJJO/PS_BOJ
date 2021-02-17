import java.io.*;

public class DAY19_11057 {

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
				if (j== 0) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4]+dp[i-1][j+5]+dp[i-1][j+6]+dp[i-1][j+7]+
							dp[i-1][j+8]+dp[i-1][j+9])%10007;
				}
				if (j== 1) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4]+dp[i-1][j+5]+dp[i-1][j+6]+dp[i-1][j+7]+
							dp[i-1][j+8])%10007;
				}
				if (j== 2) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4]+dp[i-1][j+5]+dp[i-1][j+6]+dp[i-1][j+7])%10007;
				}
				if (j== 3) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4]+dp[i-1][j+5]+dp[i-1][j+6])%10007;
				}
				if (j== 4) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4]+dp[i-1][j+5])%10007;
				}
				if (j== 5) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3]+
							dp[i-1][j+4])%10007;
				}
				if (j== 6) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2]+dp[i-1][j+3])%10007;
				}
				if (j== 7) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1]+dp[i-1][j+2])%10007;
				}
				if (j== 8) {
					dp[i][j]=(dp[i-1][j]+dp[i-1][j+1])%10007;
				}
				if (j==9) {
					dp[i][j]=dp[i-1][j]%10007;
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