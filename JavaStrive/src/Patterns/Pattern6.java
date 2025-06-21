package Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		for(int i=a; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println(" ");
		}
	}

}
