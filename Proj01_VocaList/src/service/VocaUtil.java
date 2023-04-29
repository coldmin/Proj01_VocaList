package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

import dao.VocaItem;
import dao.VocaList;

public class VocaUtil {

	public static void createItem(VocaList list) {
		String word, desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("  [단어 추가]\n"
				+ "  단어 > ");
		
		word = sc.next();
		if(list.isDuplicate(word)) {
			System.out.println("  단어가 이미 존재합니다.");
			return;
		}
		sc.nextLine();
		System.out.print("  의미 > ");
		desc = sc.nextLine().trim();
		
		VocaItem t = new VocaItem(word, desc);
		list.addItem(t);
		System.out.println("  추가되었습니다.");
	}

	public static void deleteItem(VocaList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("  [단어 삭제]\n"
				+ "  삭제할 단어를 입력하시오 > ");
		String word = sc.next();
		
		for(VocaItem item : l.getList()) {
			if(word.equals(item.getWord())) {
				l.deleteItem(item);
				System.out.println("  삭제되었습니다.");
				break;
			}else {
				System.out.println("  없는 단어입니다!");
			}
		}
	}
	
	public static void updateItem(VocaList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("  [단어 수정]\n"
				+ "  수정할 단어을 입력하시오 > ");
		String word = sc.next().trim();
		if(!l.isDuplicate(word)) {
			System.out.println("  없는 단어입니다!");
			return;
		}
		
		System.out.print("  새 단어 > ");
		String new_word = sc.next().trim();
		if(l.isDuplicate(new_word)) {
			System.out.println("  단어가 이미 존재합니다!");
			return;
		}
		sc.nextLine();
		System.out.print("  의미 > ");
		String new_description = sc.nextLine().trim();
		for(VocaItem item : l.getList()) {
			if(item.getWord().equals(word)) {
				l.deleteItem(item);
				VocaItem t = new VocaItem(new_word, new_description);
				l.addItem(t);
				System.out.println("  수정되었습니다.");
			}
			
		}
	}
	
	public static void listAll(VocaList l) {
		System.out.println("  -- 전체 목록 --");
		System.out.println();
		int count = 1;
		for(VocaItem item : l.getList()) {
			System.out.println("   "+count+ "." + item.toString());
			count++;
		}	
	}
		public static void saveList(VocaList l, String filename) {
			
			try {
				Writer w = new FileWriter(filename);
				for(VocaItem item : l.getList()) {
					w.write(item.toSaveString());
				}
					w.close();
					System.out.println("모든 데이터가 저장되었습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		public static void loadList(VocaList l, String filename) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(filename));
				String line;
				int count = 0;
				while((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, "##");
					String word = st.nextToken();
					String description = st.nextToken();
					String current_date = st.nextToken();
					VocaItem item = new VocaItem(word, description);
					item.setCurrent_date(current_date);
					l.addItem(item);
					count++;
				}
				br.close();
				System.out.println(count+"개의 항목을 읽었습니다.");
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(filename+" 파일이 없습니다.");
				// e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}