import java.util.Scanner;
public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하세요: ");
		number = input.nextInt();
		
		switch(number) {
		case 1: // number == 1이면 여기서부터 다른 케이스도 포함해서 순차적으로 실행함.
			System.out.println("하나");
			break; // 그래서 break로 종료시켜야 함.
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("없음");
			break;
			
		}
	}

}
