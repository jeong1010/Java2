
public class SafeArray {
	private int a[];
	public int length;
	public SafeArray(int size) { // 생성자.
		a = new int[size];
		length = size;
	}
	public void put(int index, int value) { // 설정자.
		if(index < length && index >= 0)
			a[index] = value;
		else
			System.out.println("잘못된 인덱스 " + index);
	}
	public int get(int index) { // 접근자.
		if(index < length && index >= 0)
			System.out.println(a[index]);
		else 
			System.out.println("잘못된 인덱스 " + index);
		return 0;
	}
	
}
