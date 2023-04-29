package menu;

public class Menu {

	public static void displaymenu() {
		System.out.println();
		System.out.println("     ▶ 우리말 단어장 ◀");
		System.out.println();
		System.out.println("  [단어장 관리 명령어 사용법]");
		System.out.println("   1. add - 단어 추가");
		System.out.println("   2. del - 단어 삭제");
		System.out.println("   3. edit - 단어 수정");
		System.out.println("   4. list - 전체 목록");
		System.out.println("   5. listName - 가나다순 정렬");
		System.out.println("   6. listDate - 날짜순 정렬");
		System.out.println("   7. exit - 종료");
		
	}
	public static void prompt() {
		System.out.print("\n  Command > ");
	}
}
