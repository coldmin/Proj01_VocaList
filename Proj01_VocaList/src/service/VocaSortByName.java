package service;

import java.util.Comparator;

import dao.VocaItem;

public class VocaSortByName implements Comparator<VocaItem> {

	@Override
	public int compare(VocaItem o1, VocaItem o2) {
		return o1.getWord().compareTo(o2.getWord());
	}

}
