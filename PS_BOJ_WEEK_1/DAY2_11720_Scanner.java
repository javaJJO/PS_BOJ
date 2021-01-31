import java.util.Scanner;
public class DAY2_11720_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next(); //공백없이 입력받아야 하므로 next()
		int sum = 0;
		sc.close();
		
		for (int i = 0; i < N; i++) {
			sum = sum + str.charAt(i)-'0'; 
			//charAt는 해당 문자의 아스키 코드값을 반환하므로 -'0' 혹은 -48 
		}
		System.out.println(sum);
	}
}