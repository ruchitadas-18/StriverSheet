package BasicMath;

import java.util.Scanner;

public class pallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int t = num;
			int a = 0;
			while(num>0) {
				int r = num%10;
				a= a*10+ r;
				num /= 10;
			}
			if(t ==a) {
				System.out.print("Number is pallindrome");
			}else {
				System.out.print("Number is not pallindrome");
			}
			

	}

}
