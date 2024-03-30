
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1; // tv1은 참조변수. 가리키는 대상이 Television.
		tv1 = new Television(); // Television 공간을 새로 만들어준 뒤 인스턴스를 만들어 지칭.
		//tv1.channel = 7; // 값을 저장하는 게 아닌, 값이 있는 위치를 알려주는 것.
		tv1.setChannel(3);
		tv1.setChannel(15); // 3 나와야 함.
		tv1.volume = 10;
		tv1.onOff = true;
		tv1.print();
		//System.out.println("텔레비전의 채널은 " + tv1.channel + "이고 볼륨은 " + tv1.volume + "입니다.");
		
		System.out.println(tv1); // tv1가 갖고있는 클래스 아이디?가 출력 됨.
								// public ... 수정 후 실행하면 오버라이드?로 문장이 출력됨.
		
		
		Television tv2 = new Television();
		//tv2 = tv1;
		//tv2.channel = 6;
		//tv2.setChannel(6); // 값을 직접 바꾸는 게 아닌, 함수를 통해 수정.
		tv1.setChannel(-1); // 7 나와야 함.
		tv2.volume = 12; // tv2 = tv1라고 했으면 값이 아니라 위치를 가리켰기 때문에 tv1도 바뀐 것처럼 나올 것임.
						// tv1과 관련 없이 만드려면 새로운 객체로 만들어줘야 함.
		//System.out.println("텔레비전의 채널은 " + tv2.channel + "이고 볼륨은 " + tv2.volume + "입니다.");
		tv2.print();
		
		
	}

}
