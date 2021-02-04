import java.io.*;

public class DAY5_11726_BOTTOM_UP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] dp = new int [n+1];
		dp[0]=1; 
		// �����յ� 1��, �� ��Ʈ���� 1��, �׷��Ƿ� ���� �簢�������� 1���� ����
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