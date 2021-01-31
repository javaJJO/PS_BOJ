import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DAY2_11718 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while ((str = br.readLine()) != null) { 
			if(str.trim().isEmpty()) // 앞뒤의 공백 제거 & 빈 줄 에러처리
				break;
			System.out.println(str);
		}
	}
}
