import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// BufferedReader는 한문장씩 읽고쓰는 방식이므로 한 줄에 숫자 한 개씩 입력받는 다면 StringTokenizer가 필요없음. 
public class DAY1_2558_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(A+B);
	}
}
