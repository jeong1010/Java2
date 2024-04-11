
public class Television {
	private int channel = 7; // 채널에 대한 권한을 내부에서만. / 채널을 7로 초기화.
	private int volume;
	private boolean onOff;
	
	public Television() { // 생성자 오버로딩. 
		this(1,1,false); // 자기 함수를 다시 호출. 
		//channel = 1; // 값 지정이 오버로딩에서 여러 번 들어가면? 형식상 어긋난 것임
		//volume = 1;
		//onOff = false;
	}
	
	public Television(int c) {
		this(c,1,false); // 이런식으로 c만 받을 수도 있다.
	}
	
	public Television(int c, int v) { // 같은 이름, 같은 매개변수, 같은 반환인자면 오버로딩이 안됨.
		// 이런식으로 매개변수 달리하면 허용이 됨.
		this(c,v,false); // 이런식으로 c만 받을 수도 있다.
	}
	
	// 생성자 추가. int c, int v, boolean o)
	public Television(int c, int v, boolean o) { // 생성자 오버로딩을 하면 결국 매개변수 가장 많은 한 쪽으로 모이기 때문에 한 곳에서 처리를 하게 됨.
		this.channel = c;
		this.volume = v;
		onOff = o;
	}
	
	

	void print() {
		System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
		// 변수 이미 선언되어 있으니 객체.channel 식으로 안 씀)
	}
	public String toString() {
		return "텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.";
	}
	public void setChannel(int newChannel) { // 퍼블릭으로 채널 변경 가능하게. 
		// 1 ~ 9 채널. 기본 채널은 7번. ex.8번으로 바꾼 뒤 10번으로 바꾸면 8번으로 감.
		if(newChannel > 0 && newChannel < 10) {
			channel = newChannel;
		}
		
	}
}
