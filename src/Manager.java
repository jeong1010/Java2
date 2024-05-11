
public class Manager extends Employee {
	private int bonus;
	Manager(String n, String a, int s, int r, int b){
		super(n, a, s, r);
		this.bonus = b;
	}
	public void test() {
		System.out.println("name=" + name);
		System.out.println("adress=" + address);
		System.out.println("salary=" + salary); // private 빼곤 자식 클래스에서 접근 가능.
		// rrn 접근 불가.
	}
}
