import java.util.Scanner;
public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("판별할 정수를 입력하세요: ");
		num = input.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");
		}
		else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
		
	}

}
