package reservation;

import java.util.LinkedList;
import java.util.Scanner;

public class SeatImpl implements Seat {
	
	Scanner scan = new Scanner(System.in);
	
	SeatRating rating = new SeatRating();
	LinkedList<String> S = new LinkedList();
	LinkedList<String> A = new LinkedList();
	LinkedList<String> B = new LinkedList();
	
	String name;
	@Override
	public void SeatSearch() {
	
	System.out.print("S : ");
	for(int i = 0;i<10;i++) {
		S.add(rating.getS());
		System.out.printf("%-4s",S.get(i));
	}
	
	System.out.println();
	
	System.out.print("A : ");
	for(int i = 0;i<15;i++) {
		A.add(rating.getA());
		System.out.printf("%-4s",A.get(i));
	}
	
	System.out.println();
	
	System.out.print("B : ");
	for(int i = 0;i<20;i++) {
		B.add(rating.getB());
		System.out.printf("%-4s",B.get(i));
	}
	System.out.println();
}

	@Override
	public void Seatrating() {
		System.out.println("어떤 등급의 좌석을 예약하시겠어요??(S ~ B");
		System.out.println("1.S등급 2.A등급 3.B등급");
		int rating = scan.nextInt();
		if(rating == 1) {
			System.out.println("몇번째 좌석을 예약하시겠어요??");
			int choice = scan.nextInt();
			S.set(choice-1, name);
			System.out.println("예약되었습니당.");
		}if(rating == 2) {
			System.out.println("몇번째 좌석을 예약하시겠어요??");
			int choice = scan.nextInt();
			A.set(choice-1, name);
			System.out.println("예약되었습니당.");
		}if(rating == 3) {
			System.out.println("몇번째 좌석을 예약하시겠어요??");
			int choice = scan.nextInt();
			B.set(choice-1, name);
			System.out.println("예약되었습니당.");
	}
		
	}

	@Override
	public void profile() {
		System.out.println("회원등록을 시작합니당.");
		System.out.println("이름을 입력해주세요.");
		name = scan.next();
		System.out.println("등록되었습니다.");
		
	}
	
	

}
