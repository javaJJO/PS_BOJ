import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class DAY3_2445 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		for (int i=1; i<=(2*N-1); i++) {
			if(i<=N) {  //i=12345
				for(int j = 0; j<N; j++) {
					bw.write("*");
				}
				for(int j=0; j<(2*N-2*i); j+=2) {
					bw.write(" ");
				}
				for(int j = 0; j<N; j++) {
					bw.write("*");
				}
			}else if(i>N) { //i=6879
				for(int j=1; j<(N-i); ) {
					
				}
			}
		}
	}
}
