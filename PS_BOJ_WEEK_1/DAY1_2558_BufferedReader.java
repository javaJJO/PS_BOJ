import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// BufferedReader�� �ѹ��徿 �а��� ����̹Ƿ� �� �ٿ� ���� �� ���� �Է¹޴� �ٸ� StringTokenizer�� �ʿ����. 
public class DAY1_2558_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(A+B);
	}
}
