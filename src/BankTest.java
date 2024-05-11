
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] bank = new Bank[3]; // Bank 3개짜리 배열. 참조변수가 세 개인 거고, 객체가 3개인 건 아님.
		bank[0] = new BadBank(); // bank[0],bank[1],bank[2]는 객체가 맞는데 위에는 그걸 가리키는 참조변수끼리 구성된 배열이니까.. 라는 의미.
		bank[1] = new NomalBank();
		bank[2] = new GoodBank();
		//GoodBank a = new GoodBank(); // 이렇게 하면 a.Name 쓸 수 있는데 bank[2]로 하면 접근할 수 없음.
		
		System.out.println("BadBank의 이자율: " + bank[0].getInterestRate());
		System.out.println("NomalBank의 이자율: " + bank[1].getInterestRate());
		System.out.println("GoodBank의 이자율: " + bank[2].getInterestRate() + ((GoodBank)bank[2]).Name); // 형변환 해주면 bank[2].Name 값 가져올 수 있음.
	
	}
	// 부모클래스 Bank는 추상적으로, 자식클래스 3가지는 다형성을 갖고..
}
