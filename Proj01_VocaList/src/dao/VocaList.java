package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import service.VocaSortByDate;
import service.VocaSortByName;

public class VocaList {
	private List<VocaItem> list;
	
	public VocaList() {
		this.list = new ArrayList<VocaItem>();
	}
	
	public void addItem(VocaItem t) { // 항목 추가하기
		list.add(t);
	}
	
	public void deleteItem(VocaItem t) { // 항목 삭제하기
		list.remove(t);
	}
	
	void editItem(VocaItem t, VocaItem updated) { // 항목 수정하기
		int index = list.indexOf(t);
		list.remove(index);
		list.add(updated);
	}
	
	public ArrayList<VocaItem> getList(){ // 전체 리스트 가져오기
		return new ArrayList<VocaItem>(list); 
	}
	
	public void sortByName() {
		Collections.sort(list, new VocaSortByName());
	}
	
	
	public void sortByDate() {
		Collections.sort(list, new VocaSortByDate());
	}
	
	public int indexOf(VocaItem t) {
		return list.indexOf(t);
	}
	
	public Boolean isDuplicate(String word) {
		for(VocaItem item : list) {
			if(word.equals(item.getWord())) return true;
		}
		return false;
	}
}
