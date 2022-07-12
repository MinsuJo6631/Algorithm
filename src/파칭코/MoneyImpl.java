package 파칭코;


import java.util.ArrayList;
import java.util.Scanner;


public class MoneyImpl implements Pocket {
	Scanner scan = new Scanner(System.in);
	Money money2 = new Money();
	ArrayList<Integer> totalmoney = new ArrayList<Integer>();

	@Override
	public void MoneyCharge() {
		System.out.println("충전금액을 입력해주세요");
		System.out.print("금액 : ");
		int money = scan.nextInt();
		System.out.println(money + "원 충전되었습니다.");
		money2.setMoney(money2.getMoney() + money);
		
	}

	@Override
	public void MoneyFind() {
		
		System.out.println("잔액 은 : " + money2.getMoney());
		
		
	}
	
	@Override
	public void Play() {
		
		if(money2.getMoney()/10000>0) {
			System.out.println("파칭코를 시작합니당");
			System.out.println("현 보유금 : " + money2.getMoney());
			int a = money2.getMoney() / 10000;
			System.out.println(a + "번 할수있습니다.");
			System.out.println("몇번을 하시겠습니까??");
			System.out.print("횟수 입력 : ");
			int choice = scan.nextInt();
			System.out.println("거스름돈 : " + (money2.getMoney()-(choice*10000)));
			int t = money2.getMoney() - (choice*10000);
			money2.setMoney(t);
		
		
			int[] number =  new int[3];
		
			for(int count= 1;count<choice+1;count++) {

				for(int num = 0;num<3;num++) {
					number[num] = (int)(Math.random()*10)+1;
				
				}
				System.out.printf(count + "결과 : [%d] [%d] [%d]",number[0],number[1],number[2]);
				System.out.println();
				
				
				
				if(count /  10 > 0 && count % 10 ==0) {
					
					System.out.println("10번판이상 한번에 결제하시면 10판마다서비스를 드립니당");
					money2.setMoney(money2.getMoney() + 5000);
					System.out.println("5000 원 서비스드렸습니당.");
				}
		
				
			if(number[0]==7 && number[1]==7 && number[2]==7) {
				System.out.println("당첨되셨습니당!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("인생에 몇번 올까말까 한기회!!!!!!!");
				System.out.println("초기 금액의 20배를 드립니다!!");
				int money = money2.getMoney()*20;
				money2.setMoney(money);
				System.out.println("현재 금액 : " + money2.getMoney());
			}
			
		
			}
		}else {
			System.out.println("잔액이 부족합니다.");
			System.out.println(( 10000 - money2.getMoney()) + "원 부족합니당,,ㅠㅠ");
			System.out.println("금액을 충전해주세요");
		}
	}
}

	
	
	
	
	


