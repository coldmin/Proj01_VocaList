package dao;

import java.util.Date;

public class VocaItem {
	private String word; // 제목
	private String desc; // 내용
	private Date current_date; // 입력시간
	
	public VocaItem(String word, String desc) {
		this.word = word;
		this.desc = desc;
		this.current_date = new Date();
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

	public Date getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(Date current_date) {
		this.current_date = current_date;
	}
	
	@Override
	public String toString() {
		return "[" + word + "]" + desc + " - " + current_date;
	}
	
	
}
