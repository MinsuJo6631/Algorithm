package 알고리즘0712;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 1;i<=a;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0;i<=a;i++) {
			for(int j = a;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
