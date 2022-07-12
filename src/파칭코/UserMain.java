package 파칭코;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pocket money = new MoneyImpl();
		
		

		
		while(true) {
			
			System.out.println("파친코프로그램를 시작합니당");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("---------------------------------------------------");
			System.out.println("1번 : 금액충전, 2번 : 잔액확인, 3번 : 플레이, 4번 : 종료");
			System.out.println("---------------------------------------------------");
			int choice = scan.nextInt();
		
		switch(choice) {
		case 1 : 
			System.out.println("금액을 충전하겠습니다.");
			money.MoneyCharge();
			break;
			
		case 2 :
			System.out.println("잔액을 확인하겠습니다.");
			money.MoneyFind();
			break;
			
		case 3 :
			
			money.Play();
			break;
			
		case 4 :
			System.out.println("즐거운시간 되셨나요??");
			System.out.println("파칭코 게임을 종료합니다.");
			System.exit(0);
			break;
			
			}
		}

	}

}
