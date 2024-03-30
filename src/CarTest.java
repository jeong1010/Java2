
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		System.out.println("색상: " + car.color + "\n현재 기어: " + car.gear + "\n현재 속도: " + car.speed);
		
		car.changeGear(4);
		for(int i=0;i<3;i++)
			car.speedUP();
		
		System.out.println("색상: " + car.color + "\n현재 기어: " + car.gear + "\n현재 속도: " + car.speed);

	}

}
