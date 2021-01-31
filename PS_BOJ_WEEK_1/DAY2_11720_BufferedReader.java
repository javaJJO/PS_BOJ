import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_11720_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine(); //공백으로 구분되지 않으므로 상관 X
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum = sum + str.charAt(i)-'0'; 
			//charAt는 해당 문자의 아스키 코드값을 반환하므로 -'0' 혹은 -48 
		}
		System.out.println(sum);
	}
}