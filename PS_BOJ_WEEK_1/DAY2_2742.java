import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			System.out.println(N-i);
		}
	}
}
/* �̷��Ե� ����! �ٸ� i>0�� �Ϳ� ��������
for(int i=N; i>0; i--) {
System.out.println(i);
*/