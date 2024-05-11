
public class Dog extends Animal {
	// 오버라이딩. 올라탄다. 써져있는 것 위에 올려놓는다.
	@Override
	public void eat() { // 자식클래스에서 재정의함. 오버라이딩.
		super.eat(); // 부모클래스의 eat()이 호출됨. this는 나. super는 부모.
		System.out.println("Dog Eat"); // Animal의 eat()을 불렀지만 Dog의 eat()가 나옴.
										// 그래서 부모 클래스가 더 먼저 들어간다는 것.
	} // 만약 Dog의 eat에서 파라미터로 a를 받으면 오버로딩관점에서 보게 됨. 함수가 두 개가 된 거니까.
	// @Override 라고 쓰면 오버라이드라고 명시해줌. 그래서 형식이 오버라이딩이 아니면 빨간줄 생김.
	public void sound() {
		System.out.println("멍멍");
	}
}
