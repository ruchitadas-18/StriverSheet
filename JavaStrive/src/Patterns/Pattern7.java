package Patterns;

public class Pattern7 {
	public static void main(String[]args) {
		int a =6;
		for(int i=0; i<a; i++) {
			
			for(int k=0;k<a-i-1; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
