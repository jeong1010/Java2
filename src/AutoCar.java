
public class AutoCar implements OperateCar {

	@Override
	public void start() { // 부모클래스의 메서드 재정의중. = 오버라이드.
		// TODO Auto-generated method stub
		System.out.println("start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	//@Override // 오버라이드 지워서 자식클래스의 메서드가 됨.
	public int setSpeed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("setSpeed: "+speed);
		return 0;
	}

	@Override
	public int turn(int degree) {
		// TODO Auto-generated method stub
		System.out.println("turn: "+degree);
		return 0;
	}
	
}
