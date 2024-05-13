import java.util.Scanner;
public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.141592; // 상수. 자바에서는 double이 기본 실수형이기 때문에 float이 아니라 더블로 사용하면 빨간줄 안 뜸.
		// final은 상수. 값 변경 불가.
		double radius, area;
		System.out.print("반지름의 크기 입력: ");
		radius = input.nextDouble(); // 입력받은 값 더블로 반환.
		area = radius * radius * PI;
		System.out.println("반지름이 " + radius + "인 원의 면적은" + area + "입니다.");
		

	}

}
