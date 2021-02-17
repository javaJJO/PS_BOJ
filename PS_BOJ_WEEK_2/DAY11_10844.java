import java.io.*;

public class DAY11_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N + 1][10];
		
		dp[1][0]=0;// 0���� �����ϴ� ���� ����
		
		//i(N��)�� 1�� ��(���ڸ��� �϶�) 
		for (int j = 1; j < 10; j++) { 
			//���⼭ j�� �ڸ���
			dp[1][j] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) { //�ڸ����� 0�� ���
					dp[i][j] = dp[i - 1][j+1]%1000000000;
				}
				else if (j == 9) { //�ڸ����� 9�� ���
					dp[i][j] += dp[i - 1][j-1]%1000000000;
				}
				else { //�� �̿��� ���
					dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
				}
			}
		}
		long sum = 0; //����� ���� �����ش�
		for (int j = 0; j < 10; j++) { 
			sum = (sum + dp[N][j]);
		}
		bw.write(String.valueOf(sum%1000000000));
		br.close();
		bw.flush();
		bw.close();
	}
}