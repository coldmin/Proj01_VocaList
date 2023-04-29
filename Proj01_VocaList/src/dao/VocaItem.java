package dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VocaItem {
	private String word; // 단어
	private String desc; // 내용
	private String current_date; // 입력시간
	private String category;
	
	public VocaItem(String word, String desc) {
		this.word = word;
		this.desc = desc;
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss"); // 날짜를 특정 형식의 문자열로 저장
		this.current_date = f.format(new Date());
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(String current_date) {
		this.current_date = current_date;
	}
	
	@Override
	public String toString() {
		return " [" + word + "]" +" "+ desc + " (" + current_date + ")";
	}
	public String toSaveString() {
		return word + "##" + desc + "##" + current_date + "\n";
	
	}
}
