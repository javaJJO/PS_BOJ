import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_11721 {

	/*
	 * ���̰� 0�� �ܾ�� �־����� �ʴ´�/ �־����� �ܾ ���� ����/ ������ �ٿ��� 10�� �̸� ����
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
			if(i%10==9) {
				System.out.println();
			}
		}
	}
}

/* �ʹ� ��ư� �����߾���,,,,,��
String str = br.readLine().trim();
int A = str.length() / 10;
int B = str.length() % 10;
for (int i = 0; i < A-1; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.println(str.charAt((10 * i) + j));
		System.out.println();
	}
}
	for (int i = 0; i < A-1; i++) {
	for (int j = 0; j < B; j++) {
		System.out.println(str.charAt((10 * i) + j));
	}
}
*/