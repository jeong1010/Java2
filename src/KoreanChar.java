
public class KoreanChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0xAC00;
		int[] changeChar = {0xAC00, 0xB098, 0xB2E4, 0xB77C, 0xB9C8, 0xBC14, 0xC0AC, 0xC544, 0xC790, 0xCC28, 0xCE74, 0xD0C0, 0xD30C, 0xD558};
		
		do {
			for(int i=0;i<14;i++) {
				if(i != 0 && c == changeChar[i]) {
					System.out.println("\n자음 변경 " + (char)changeChar[i-1] + "->" + (char)changeChar[i]);
					System.out.println("#################################################");
				}	
			}
			System.out.print((char)c++ + " ");
		}
		while(c <= 0xD7A3);
		
		
	}

}
