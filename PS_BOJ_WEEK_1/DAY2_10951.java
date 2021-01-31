import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class DAY2_10951 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T ;
		
 		/*String T = br.readLine();
 		 while( T !=) { 이렇게 쓰면 에러
 		 입력받는 것 자체가 null일 때 반복을 멈춰야하니까 */
		
		while((T= br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(T," ");	
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());		
			System.out.println(A+B);
		}
	}
}
