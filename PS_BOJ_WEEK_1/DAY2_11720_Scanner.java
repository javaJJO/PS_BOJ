import java.util.Scanner;
public class DAY2_11720_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next(); //������� �Է¹޾ƾ� �ϹǷ� next()
		int sum = 0;
		sc.close();
		
		for (int i = 0; i < N; i++) {
			sum = sum + str.charAt(i)-'0'; 
			//charAt�� �ش� ������ �ƽ�Ű �ڵ尪�� ��ȯ�ϹǷ� -'0' Ȥ�� -48 
		}
		System.out.println(sum);
	}
}