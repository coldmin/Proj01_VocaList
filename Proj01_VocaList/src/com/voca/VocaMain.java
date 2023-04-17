package com.voca;

import java.util.Scanner;

import dao.VocaList;
import menu.Menu;
import service.VocaUtil;

public class VocaMain {

	public static void start() {
		Scanner sc = new Scanner(System.in);
		VocaList l = new VocaList();
		boolean isList = false;
		boolean quit = false;
		
		Menu.displaymenu();
		do {
			Menu.prompt();
			isList = false;
			String choice = sc.next();
			switch(choice) {
			
			case "add":
				VocaUtil.createItem(l);
				break;
				
			case "del":
				VocaUtil.deleteItem(l);
				break;
				
			case "edit":
				VocaUtil.updateItem(l);
				break;
				
			case "list":
				VocaUtil.listAll(l);
				break;
				
			case "list_name":
				l.sortByName();
				System.out.println("가나다순으로 정렬하였습니다.");
				isList = true;
				break;	
				
			case "list_date":
				l.sortByDate();
				System.out.println("날짜순으로 정렬하였습니다.");
				isList = true;
				break;
				
			case "help":
				Menu.displaymenu();
				break;
				
			case "exit":
				quit = true;
				break;
				
			default:
				System.out.println("정확한 명령어를 입력하세요. (도움말 - help)");
				break;	
			
			}
			if(isList) VocaUtil.listAll(l);
		} while (!quit);
		
	}
}
