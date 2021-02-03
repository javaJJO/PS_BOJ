import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class DAY5_2446 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) { 
			for(int j=0; j<i; j++) {
				bw.write(" ");
			}
			for (int j=0; j< (2*N)-((2*i)+1); j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		for (int i=0; i< N-1; i++) {
			for(int j=0; j<N-i-2; j++) {
				bw.write(" ");
			}
			for(int j=0; j<((2*(i+2))-1); j++) {
				bw.write("*");
			}
			bw.newLine();
		}	
		br.close();
		bw.flush();
		bw.close();
	}
}