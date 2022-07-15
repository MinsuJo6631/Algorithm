package bank;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankWorkImpl bank = new BankWorkImpl();
		
		TotalMenu : 
		while(true) {
			System.out.println("모드를 선택해주세요");
			System.out.println("1.손님 2.은행장님");
			int modechoice = scan.nextInt();
			
			switch(modechoice) {
			
			case 1: 
				while(true){
					System.out.println("은행업무를 선택해주세요");
					System.out.println("1.계좌 조회 2.입금 3.계좌이체 4. 계좌개설 5. 은행업무 종료");
					
					int choice = scan.nextInt();
					
					switch(choice) {
					
					case 1 : 
						
						bank.findnum();
						break;
						
					case 2 :
						bank.inputMoney();
						break;
						
					case 3 :
						bank.sendMoney();
						break;
						
					case 4 :
						
						bank.createnum();
						break;
					case 5 :
						
						System.out.println("은행업무를 종료합니다.");
						System.out.println("안녕히가세요");
						continue TotalMenu;
					}
				}
				
			case 2:
				System.out.println("은행장님 이시면 비밀번호를 입력해주세요");
				System.out.println("초기 비밀번호 1234");
				bank.PassWord.add(1234);
				bank.CaptainName.add("MinsuJo");
				int password = scan.nextInt();
				
				if(password == bank.PassWord.get(0)) {
					System.out.println("안녕하세요"+ bank.CaptainName.get(0) + "은행장님!");
					while(true) {
						System.out.println("메뉴를 선택해주세요!");
						System.out.println("1.은행총 보유자산 확인 2.고객 수 확인 3.고객 개인정보내역 확인 4. VIP고객 확인 5.은행장 정보 6.프로그램종료");
						System.out.println("VIP고객님은 보유금액이 100000원 이상인금액이 해당됩니다");
						int choice = scan.nextInt();
						
						switch(choice) {
						
						case 1 :
							bank.TotalMoney();
							break;
							
						case 2 :
							bank.CountCostomer();
							break;
						case 3 :
							bank.SeeConstomerInfo();
							break;
						case 4 : 
							bank.SeeVip();
							break;
							
						case 5 :
							bank.CaptainInfo();
							break;
							
						case 6 :
							System.out.println("시스템을 종료합니다");
							
							
						
						}
					}
					
				}
				
			}
		
		
		
		}

	}

}
