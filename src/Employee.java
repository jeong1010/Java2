
public class Employee {
	public String name;
	String address;
	protected int salary; // 월급.
	private int rrn; // 주민등록번호.
	
	public Employee(String n, String a, int s, int r){
		this.name = n;
		this.address = a;
		this.salary = s;
		this.rrn = r;
	}
	
	@Override
	public String toString() {
		return ("Employee [name="+this.name+", adress="+this.address+", salary="+this.salary+", rrn="+this.rrn+"]");
	}
}
