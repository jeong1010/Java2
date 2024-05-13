
public class AutoCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateCar obj = new AutoCar(); // AutoCar -> OperateCar : 상향 형변환.
		// 상향 형변환: 부모 클래스가 자식 클래스를 대신할 수 있다.
		obj.start();
		obj.stop();
		((AutoCar)obj).setSpeed(10); // 이렇게 형변환 가능. .연산이 먼저니까 괄호 잘 쳐줘야 함.
		obj.turn(20);
	}

}
