
public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCounter obj = new MyCounter();
		obj.value = 10;
		
		MyCounter obj2 = new MyCounter(); // 이 또한 value와 inc를 갖는다.
		obj2.inc(obj); // MyCounter로 받음. 참조변수로 받는 것임. 참조변수는 주소를 보냄.
		// obj2.inc(obj.value); // 라고해도 계속 10일 것임. int를 보내줬으니까. int는 기초변수.
		// 복사본이 아니라 주소를 줬기 때문에 obj2의 inc로 증가시켜도 obj의 value에 반영이 됨.
		// 기초변수: 복사본을 줌. 참조변수: 와서 쓰세요~
		System.out.println("x: " + obj.value);
	}

}
