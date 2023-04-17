package service;

import java.util.Scanner;

import dao.VocaItem;
import dao.VocaList;

public class VocaUtil {

	public static void createItem(VocaList list) {
		String word, desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[단어 추가]\n"
				+ "단어 > ");
		
		word = sc.next();
		if(list.isDuplicate(word)) {
			System.out.println("단어가 이미 존재합니다!");
			return;
		}
		sc.nextLine();
		System.out.print("의미 > ");
		desc = sc.nextLine().trim();
		
		VocaItem t = new VocaItem(word, desc);
		list.addItem(t);
		System.out.println("추가되었습니다.");
	}

	public static void deleteItem(VocaList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[단어 삭제]\n"
				+ "삭제할 단어를 입력하시오 > ");
		String word = sc.next();
		
		for(VocaItem item : l.getList()) {
			if(word.equals(item.getWord())) {
				l.deleteItem(item);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
	}
	
	public static void updateItem(VocaList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[단어 수정]\n"
				+ "수정할 단어을 입력하시오 > ");
		String word = sc.next().trim();
		if(!l.isDuplicate(word)) {
			System.out.println("없는 단어입니다!");
			return;
		}
		
		System.out.print("새 단어 > ");
		String new_word = sc.next().trim();
		if(l.isDuplicate(new_word)) {
			System.out.println("단어가 이미 존재합니다!");
			return;
		}
		sc.nextLine();
		System.out.print("의미 > ");
		String new_description = sc.nextLine().trim();
		for(VocaItem item : l.getList()) {
			if(item.getWord().equals(word)) {
				l.deleteItem(item);
				VocaItem t = new VocaItem(new_word, new_description);
				l.addItem(t);
				System.out.println("수정되었습니다.");
			}
			
		}
	}
	
	public static void listAll(VocaList l) {
		System.out.println("[전체 목록]");
		for(VocaItem item : l.getList()) {
			System.out.println(item.toString());
		}
	}
}