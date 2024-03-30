
public class Television {
	private int channel = 7; // 채널에 대한 권한을 내부에서만.
	int volume;
	boolean onOff;

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
