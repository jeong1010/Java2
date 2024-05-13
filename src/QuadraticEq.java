import java.util.Scanner;
public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double b, c, d, root1, root2;
		
		System.out.print("b와 c의 값을 입력(입력 예: -3, 2): ");
		b = input.nextDouble();
		c = input.nextDouble();
		// 
		d = b*b - 4*c;
		if(d > 0) { // 서로 다른 두 근
			root1 = (-1*b - Math.sqrt(d)) / 2; //  근의공식: {-b +- 루트(b^2 - 4ac)} / 2a
			root2 = (-1*b + Math.sqrt(d)) / 2;
			System.out.println("해당 방정식의 근은 " + root1 + ", " + root2 + "입니다.");
		}
		else if(d == 0) { // 중근 
			root1 = -1*b / 2;
			System.out.println("해당 방정식의 근은 "+ root1 + "입니다.");
		}
		else if(d < 0) { // 근이 없음
			System.out.println("해당 방정식은 실수인 근이 없습니다.");
		}
	}

}
