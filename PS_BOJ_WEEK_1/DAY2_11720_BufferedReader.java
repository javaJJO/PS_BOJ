import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_11720_BufferedReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine(); //�������� ���е��� �����Ƿ� ��� X
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum = sum + str.charAt(i)-'0'; 
			//charAt�� �ش� ������ �ƽ�Ű �ڵ尪�� ��ȯ�ϹǷ� -'0' Ȥ�� -48 
		}
		System.out.println(sum);
	}
}