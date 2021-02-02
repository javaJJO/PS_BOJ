import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class DAY2_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		/*String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);*/
		
		int sum_day = 0;
		for (int i = 1; i <=12; i++) {
			if(i==x) break;
			sum_day = sum_day + month[i-0];
		}
		sum_day=sum_day + y;
		int date = sum_day % 7;

		switch (date) {
		case 1:
			bw.write("MON");
			break;
		case 2:
			bw.write("TUE");
			break;
		case 3:
			bw.write("WED");
			break;
		case 4:
			bw.write("THU");
			break;
		case 5:
			bw.write("FRI");
			break;
		case 6:
			bw.write("SAT");
			break;
		default:
			bw.write("SUN");
			break;
		}
		br.close();
		bw.flush();
		bw.close();
	}
}