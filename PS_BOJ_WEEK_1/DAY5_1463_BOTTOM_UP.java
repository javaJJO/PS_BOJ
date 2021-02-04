import java.io.*;
public class DAY5_1463_BOTTOM_UP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1]; // �� N+1? : ������ 1���� ����N����

		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		}
		bw.write(dp[N]+"\n"); //"\n"�� ����� �ϳ�
		br.close();
		bw.flush();
		bw.close();
	}
}
