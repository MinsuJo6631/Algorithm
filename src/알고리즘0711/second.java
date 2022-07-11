package 알고리즘0711;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i = 1;i<10;i++) {
			System.out.println(a + " * " + i +" = " + a*i);
		}

	}

}