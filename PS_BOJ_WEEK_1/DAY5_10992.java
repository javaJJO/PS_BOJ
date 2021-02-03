import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class DAY5_10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N-1; i++) { //N-1개 줄
			for(int j= 1; j<N-i; j++) { // 첫 공백
				bw.write(" ");
			}
			bw.write("*"); // 첫 공백 끝나고 한개*
			for(int j=0; j<((2*i)-1); j++) { // 가운데 공백
				bw.write(" ");
			}
			if(i!=0) bw.write("*"); // 가운데 공백 끝나고 한개*
			bw.write("\n"); 
		}
		for(int i = 0; i<(2*N)-1; i++) {
		bw.write("*");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}