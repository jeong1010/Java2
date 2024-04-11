
public class Car {
	//public String color = "red"; // private로 선언하면 SportsCar에서 접근 못함(자식 클래스니까.)
	private String color = "red";
	public int speed = 80, gear = 2;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// 가속
	public void speedUP() { // 최대 속도 300km/h
		if(speed <= 300)
			speed++;
	}
	
	// 감속
	public void speedDOWN() {
		if(speed > 0)
			speed--;
	}
	
	// 기어 변경
	public void changeGear(int g) { // 기어 5단까지로 설정.
		if(g >= 1 && g <= 5)
			gear = g;
	}
}
