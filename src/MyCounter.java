
public class MyCounter {
	public int value;
	public void inc(MyCounter a) { // 값 증가. increment
		a.value++; // 기초변수가 아니라 참조변수로 보내서 값 증가가 반영이 됨.
	}
}
