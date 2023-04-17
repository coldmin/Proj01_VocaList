package service;

import java.util.Comparator;

import dao.VocaItem;

public class VocaSortByDate implements Comparator<VocaItem> {

	@Override
	public int compare(VocaItem o1, VocaItem o2) {
		return o1.getCurrent_date().compareTo(o2.getCurrent_date());
	}

}
