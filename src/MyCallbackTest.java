import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MyCallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener obj = new MyClass();
		//Timer t = new Timer(1000, obj); // 먼저 만들어있는 함수를 사용.
		Timer t = new Timer(1000, event->{System.out.println("beep");}); // 이렇게 람다식으로 쓸 수 있다.
		// t는 1000ms마다 이벤트 호출.
		t.start(); // 시작. 시작버튼 느낌.
		try {
			Thread.sleep(10000); // 시스템이 꺼지면 안 되니까 10초정도 켜두는 것.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try-catch로 예외처리.
	}

}
