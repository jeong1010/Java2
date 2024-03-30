import java.util.Arrays;
import java.util.Scanner;
public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] Arr = new int[5];
		int i;
		
		System.out.print("양수 5개를 입력하세요: ");
		
		for(i=0;i<5;i++) {
			Arr[i] = input.nextInt();
		}
		
//		for(i=0;i<5;i++) {
//			System.out.println(Arr[i]);
//		}
		
		Arrays.sort(Arr);
		
//		for(i=0;i<5;i++) {
//			System.out.println(Arr[i]);
//		}
		
		System.out.println("가운데 값은 " + Arr[2] + "입니다.");
		
	}

}
