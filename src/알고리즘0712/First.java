package 알고리즘0712;

import java.util.Scanner;
import java.math.*;

public class First {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰입력");
		BigInteger a = new BigInteger(scan.next());
		System.out.println("두번쨰입력");
		BigInteger b = new BigInteger(scan.next());
		
		System.out.println(a.add(b));

	}

}
