package menu;

public class Menu {

	public static void displaymenu() {
		System.out.println();
		System.out.println("▶ 우리말 단어장 ◀");
		System.out.println();
		System.out.println("[[단어장 관리 명령어 사용법]]");
		System.out.println("add - 단어 추가");
		System.out.println("del - 단어 삭제");
		System.out.println("edit - 단어 수정");
		System.out.println("list - 전체 목록");
		System.out.println("list_name - 가나다순 정렬");
		System.out.println("list_date - 날짜순 정렬");
		System.out.println("exit - 종료");
		
	}
	public static void prompt() {
		System.out.print("\nCommand > ");
	}
}
