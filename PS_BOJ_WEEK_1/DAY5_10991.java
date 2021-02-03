import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class DAY5_10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<N; i++) { // 몇 줄
			for(int j=0; j<N-(i+1); j++) { // 공백
				bw.write(" ");
			}
			for(int j=0; j<=i; j++) { //* + " " 세트로 몇번
				bw.write("*");
				bw.write(" ");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}