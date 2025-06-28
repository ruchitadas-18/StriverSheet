package BasicMath;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		while(num>0) {
			int r = num%10;
			a= a*10+ r;
			num /= 10;
		}
		System.out.println(a);
	}

}
