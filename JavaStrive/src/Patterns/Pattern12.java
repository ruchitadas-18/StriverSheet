package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int space = 2*(a-2);
		for(int i=1; i<a; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			for(int k=0; k<space;k++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println(" ");
			space -=2;
			
		}
	}

}
