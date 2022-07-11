package 알고리즘0711;

import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>0 && b>0) {
			System.out.println("1");
		}else if(a<0 && b>0) {
			System.out.println("2");
		}else if(a<0 && b<0) {
			System.out.println("3");
		}else if(a>0 && b<0) {
			System.out.println("4");
		}
		

	}

}