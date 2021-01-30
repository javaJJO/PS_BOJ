import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*BufferedReader는 한문장씩 읽고쓰는 방식이므로 한 줄에 공백을 기준으로 숫자를 입력받기 위해서는 
StringTokenizer를 이용해 구분자(여기서는 공백 " ")로 문자열을 구분.*/
public class DAY1_1000_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		/*이렇게 한번에 입력 
		 * && String str = br.readLine
		StringTokenizer st = new StringTokenizer(str," "); 
		이렇게 두문장으로 구분해서 사용해도 됨*/
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		br.close();

		System.out.println(A+B);
	}
}
