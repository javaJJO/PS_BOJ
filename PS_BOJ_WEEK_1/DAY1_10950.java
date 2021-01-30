import java.util.Scanner;
public class DAY1_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		sc.close();
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
			cnt ++;
			if(cnt<T) {
				break;
			}
		}
	}
}
