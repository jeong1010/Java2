import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year;
		boolean isLeapYear;
		
		System.out.print("윤년 여부를 확인할 년도 입력(입력 예: 2024): ");
		year = input.nextInt();
		if(year % 4 == 0) // 4로 나누어 떨어지는 해는 윤년.
			isLeapYear = true;
		else
			isLeapYear = false;
		
		System.out.println(isLeapYear);
		
	}

}
