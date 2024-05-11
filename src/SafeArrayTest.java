
public class SafeArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array = new SafeArray(3);
		
		for(int i=0;i<(array.length + 5);i++) {
			array.put(i, i*10);
		}
		
		array.get(1);
	}

}
