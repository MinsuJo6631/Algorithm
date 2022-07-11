package 알고리즘0711;

import java.util.ArrayList;
import java.util.Scanner;

public class fourth{

	public static void main(String[] args) {
		ArrayList<Integer> sum = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 0;i<=a;i++) {
			 sum.add(a-i);
	}
		int result = 0;
		for(int j = 0;j<sum.size();j++) {
			 result += sum.get(j);
			 
		}
		System.out.println(result);
	}

}
