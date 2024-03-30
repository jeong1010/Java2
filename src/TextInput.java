
class TextInput {
	public boolean ParseWWW(String text) {
		if(text.length() < 3) // 3글자 보다 적으면 false(인덱스 초과 오류 방지)
			return false;
		else {
			if(text.charAt(0) == 'w' && text.charAt(1) == 'w' && text.charAt(2) == 'w')
				return true;
			else
				return false;
		}
	}
}
