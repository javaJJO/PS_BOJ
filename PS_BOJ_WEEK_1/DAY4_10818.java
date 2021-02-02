import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class DAY4_10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int [] num = new int[N];
		int min = 1000000;
		int max = -1000000;
		
		for (int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]>max) max=num[i];
			if(num[i]<min) min=num[i];
		}
		bw.write(min+" "+max);
		br.close();
		bw.flush();
		bw.close();
	}
}