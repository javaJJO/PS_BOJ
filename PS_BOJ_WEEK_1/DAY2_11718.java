import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_11718 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while ((str = br.readLine()) != null) { 
			if(str.trim().isEmpty()) // �յ��� ���� ���� & �� �� ����ó��
				break;
			System.out.println(str);
		}
	}
}
