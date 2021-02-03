	import java.util.Scanner;
	public class DAY5_2445_Scanner {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			sc.close();
			
			for (int i = 0; i < N; i++) { // 1-5มู
				for (int j = 0; j <i+1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < N-i-1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < N-i-1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i=1; i<N; i++) { //6-9มู
				for (int j = 0; j <N-i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <N-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}