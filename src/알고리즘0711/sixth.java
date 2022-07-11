package 알고리즘0711;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int b = 0;b<a;b++) {
			int [] arr = new int[2];
			arr[0] = scan.nextInt();
			arr[1] = scan.nextInt();
			int sum =  (int)arr[0] + (int)arr[1];
			System.out.println(sum);
		}

	}

}