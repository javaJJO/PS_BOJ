import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			System.out.println(N-i);
		}
	}
}
/* 이렇게도 가능! 다만 i>0인 것에 유의하자
for(int i=N; i>0; i--) {
System.out.println(i);
*/