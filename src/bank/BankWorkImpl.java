package bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BankWorkImpl implements BankWork{
	HashMap<String,String> total = new HashMap<String,String>();
	HashMap<Integer,String> privateinfo = new HashMap<Integer,String>();
	HashMap<String,Integer> usermoney = new HashMap<String,Integer>();
	ArrayList<String> name1 = new ArrayList<String>();
	ArrayList<String> banknum1 = new ArrayList<String>();
	ArrayList<Integer> age1 = new ArrayList<Integer>();
	ArrayList<String> personalnum1 = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	int totalmoney;
	ArrayList<Integer> PassWord = new ArrayList<Integer>();
	ArrayList<String> CaptainName = new ArrayList<String>();
	
	
	//고객메뉴 
	@Override
	public void findnum() {  //이름 입력받아서 계좌조회
		System.out.println("계좌를 확인합니다.");
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		if(usermoney.containsKey(name)) {
			System.out.println("계좌번호 : " + total.get(name));
			System.out.println("계좌 보유 금액 : " + usermoney.get(name));
		}else {
			System.out.println("존재하지않는 회원입니다.");
		}
		
	}

	@Override
	public void inputMoney() {  //입력받은 이름의 계좌에 돈입금
		System.out.println("돈을 입금합니다.");
		System.out.println("사용자분의 성함을 입력해주세요");
		String name = scan.next();
		if(total.containsKey(name)) {
			System.out.println("입금 하실금액을 입력해주세요");
			int money = scan.nextInt();
			usermoney.put(name, money);
			System.out.println(money + "원 입금되었습니다.");
			
		}
		
		
	}

	@Override
	public void sendMoney() { //입력받은게좌에서 두번째입력받은 계좌로 송금
		System.out.println("계좌이체를 진행합니다");
		System.out.println("이름 을 입력해주세요");
		String name = scan.next();
		if(usermoney.containsKey(name)) {
				System.out.println(name + "님 의 보유금액 : " + usermoney.get(name));
				System.out.println("얼마를 입금하시겠습니까??");
				int usemoney = scan.nextInt();
				int leftmoney = usermoney.get(name) - usemoney;
				usermoney.put(name,leftmoney);
				System.out.println("입금하실분의 성함을 입력해주세요");
				String name2 = scan.next();
				if(usermoney.containsKey(name2)) {
					int resultmoney = usermoney.get(name2) + usemoney;
					usermoney.put(name2, resultmoney);
					System.out.println(usemoney + "원 입금되었습니다.");
				}else {
					System.out.println("존재하지않는 고객입니다.");
				}
				
			
			
		}
		
	}

	@Override
	public void createnum() { //계좌 개설
		System.out.println("계좌를 개설 합니다.");
		System.out.println("계좌를 개설하려면 이름,나이,주민등록번호가 필요합니다.");
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		System.out.println("나이를 입력해주세요");
		int age = scan.nextInt();
		if(19<age) {
			System.out.println("성인이 확인되었습니다");
			System.out.println("마지막으로 주민등록번호를 입력해주세요");
			String personalInfo = scan.next();
			System.out.println("확인되셨습니다.");
			System.out.println("하고싶은 계좌번호를 입력해주세요");
			System.out.println("예시 : 3333-08-6056194  (-포함, 15자리)");
			String num = scan.next();
			total.put(name,num);
			privateinfo.put(age,personalInfo);
			usermoney.put(name, 0);
			System.out.println(name + " : " + total.get(name));
			System.out.println("등록되었습니다.");
		}
		
	}

	//은행장님
	@Override
	public void TotalMoney() {
		for(HashMap.Entry<String, Integer> entry : usermoney.entrySet()) {
			totalmoney = totalmoney + entry.getValue();
		}
		System.out.println("은행보유 총액 : " + totalmoney);;
	}

	@Override
	public void CountCostomer() {
		System.out.println("총고객의 수는" + usermoney.size() + "명 입니다");
		
	}

	@Override
	public void SeeConstomerInfo() {
		System.out.println("고객들의 개인정보를 열럄하시겠습니까??");
		System.out.println("1.Yes 2. No");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("고객님들의 정보를 열람합니다");
			System.out.println("개인정보 보호법에따라 고객님의 개인정보를 다른목적으로 사용시 법적처벌을 받을수 있습니다.");
			for(int i = 0;i<total.size();i++) {
				for(HashMap.Entry<String, String> entry : total.entrySet()) {
					name1.add(entry.getKey());
					banknum1.add(entry.getValue());
				}
				for(HashMap.Entry<Integer, String> entry1 : privateinfo.entrySet()) {
					age1.add(entry1.getKey());
					personalnum1.add(entry1.getValue());
					
				}
			System.out.println("이름 : " + name1.get(i));
			System.out.println("나이 : " + age1.get(i));
			System.out.println("주민등록번호: " + personalnum1.get(i));
			System.out.println("계좌번호 : " + banknum1.get(i));
			System.out.println();
			}	
		
		}
		
	}

	@Override
	public void SeeVip() {
		System.out.println("Vip 를 확인합니다");
		for(HashMap.Entry<String,Integer> entry1 : usermoney.entrySet()) {
			int money = entry1.getValue();
			if(money>100000) {
				System.out.println(entry1.getKey());
				System.out.println(entry1.getKey() + "님이 VIP 입니다.");
			}
		}
	}

	@Override
	public void CaptainInfo() {
		

		System.out.println("은행장님의 정보를 확인하는메뉴입니다.");
		System.out.println("1.은행장 정보변경 2.비밀번호 변경 3. 프로그램종료");
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1 :
			System.out.println("은행장님의 정보를 변경하실려면 비밀번호를 입력해주세요");
			int pass = scan.nextInt();
			if(pass == PassWord.get(0)) {
				System.out.println("은행장님의 이름을 변경합니다.");
				System.out.println("현재 은행장님 의 성명 : " + CaptainName.get(0));
				System.out.println("변경하실 이름을 입력해주세요");
				String name = scan.next();
				CaptainName.set(0,name);
				System.out.println(CaptainName.get(0) + "은행장님 부임을 환영합니다.");
				
				break;
				
			}
			
		
		case 2 :
			System.out.println("비밀번호를 변경하실려면 현재비밀번호를 입력해주세요");
			int pass1 = scan.nextInt();
			if(pass1 == PassWord.get(0)) {
				System.out.println("비밀번호를 변경합니다");
				System.out.println("변경하실 비밀번호를 입력해주세요");
				int changepassword = scan.nextInt();
				PassWord.set(0, changepassword);
				System.out.println("변경되었습니다.");
				break;
			}
			
			
		case 3 :
			System.out.println("시스템을 종료합니다");
			System.exit(0);
			
		}
		
	}
}
