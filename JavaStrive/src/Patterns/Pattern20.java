package Patterns;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6;
		int space = 2*(a-2);
		for(int i=1; i<a; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int k=0; k<space;k++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			space -=2;
		}
		for(int i=a; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int k=0; k<space;k++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			space +=2;
		}
	}

}
