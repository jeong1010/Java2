import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2, maxNum;
		
		System.out.print("정수 두 개를 입력하세요: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			maxNum = num1;
		}
		else {
			maxNum = num2;
		}
		
		System.out.println("두 개의 정수 중 더 큰 수는 " + maxNum + "입니다.");
	}

}
