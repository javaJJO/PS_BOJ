import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DAY3_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr_N = new int[N];
		int max = -1000001;
		int min = 1000001;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr_N[i] = Integer.parseInt(st.nextToken());
			if (arr_N[i] > max) {
				max = arr_N[i];
			} else if (arr_N[i] < min) {
				min = arr_N[i];
			}
		}
		System.out.println(min + " " + max);
	}
}