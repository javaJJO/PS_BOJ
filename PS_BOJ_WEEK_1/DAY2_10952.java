import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class DAY2_10952 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while( true ){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 & B==0) break; //&& 가 시간이 더 절약됨 (앞조건이 참일때만 뒤조건도 검사하니까)
			
			System.out.println(A+B);
		}
	}
}
