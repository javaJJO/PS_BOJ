import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*BufferedReader�� �ѹ��徿 �а��� ����̹Ƿ� �� �ٿ� ������ �������� ���ڸ� �Է¹ޱ� ���ؼ��� 
StringTokenizer�� �̿��� ������(���⼭�� ���� " ")�� ���ڿ��� ����.*/
public class DAY1_1000_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		/*�̷��� �ѹ��� �Է� 
		 * && String str = br.readLine
		StringTokenizer st = new StringTokenizer(str," "); 
		�̷��� �ι������� �����ؼ� ����ص� ��*/
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		br.close();

		System.out.println(A+B);
	}
}
