
public class SportsCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SportsCar obj1 = new SportsCar(); // SportsCar의 공간 할당.
		Car obj1 = new SportsCar(); // 이렇게 써도 오류 안 남. SportsCar는 Car의 확장이라?
		//obj1.color = "blue"; // SportsCar에는 color가 없지만 부모 클래스인 Car에 있기 때문에 가능.
		obj1.setColor("blue");
		//obj1. 하면 어느 클래스에서 왔는지 볼 수 있다.
	}

}
