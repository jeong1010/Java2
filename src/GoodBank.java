
public class GoodBank extends Bank{
	// 아무것도 안 적었으면 부모의 abstract 함수를 만들어줘야 한다고 경고뜸. ( = 추상클래스)
	@Override
	public double getInterestRate() {
		return 3.0;
	}
	public String Name = "Good";
}
