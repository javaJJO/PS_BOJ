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
		int A = str.length()/10;
				
		for (int i=0; i<=A; i++) {
			if(i!=A) {
				System.out.println(str.substring(i*10,(i*10)+10));
			}
			if(i==A){
				System.out.println(str.substring(i*10));
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