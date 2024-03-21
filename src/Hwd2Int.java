import java.util.Scanner;

public class Hwd2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String Hwdnumber;
		
		System.out.print("한글을 입력하세요: ");
		Hwdnumber = input.next(); // 기본적으로 문자로 입력받아서 next 뒤에 뭐 안붙음.
		
		switch(Hwdnumber) {
		case "하나": // 이런식으로도 쓸 수 있다. (break 없이)
		case "일","첫째":
			System.out.println(1);
			break;
		case "둘","이","둘째":
			System.out.println(2);
			break;
		default:
			System.out.println("없음");
			break;
		}

	}
}