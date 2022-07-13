package reservation;

import java.util.Scanner;

public class ClientMain  {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Seat seat = new SeatImpl();

		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.회원 정보 입력, 2.좌석 조회, 3.좌석 예약, 4.시스템종료");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1 : 
				
				seat.profile();
				break;
				
			case 2 :
				
				seat.SeatSearch();
				break;
				
				
			case 3 : 
				
				seat.Seatrating();
				break;
				
			}
		}

	}

}
