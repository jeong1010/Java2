import java.util.Scanner;

public class TextInputTest {
	
	public static void main(String[] args) {
		TextInput ti = new TextInput();
		Scanner input = new Scanner(System.in);
		String text;
		
		while(true) {
			System.out.print("문자열을 입력하세요> ");
			text = input.next();
			
			if(text.equals("quit")) // quit 입력했으면 종료.
				break;
			
			else { // 아니면 'www'로 시작하는지 비교.
				if(ti.ParseWWW(text)) {
					System.out.println(text + "은 'www'로 시작합니다.");
				}
				else {
					System.out.println(text + "은 'www'로 시작하지 않습니다.");
				}
			}
		}
	}	
}
