package Patterns;

public class Pattern14 {
	public static void main(String[]args) {
		int a =6; 
		for(int i=a; i>0; i--) {
			char num ='A';
			for(int j=0; j<=i; j++) {
				System.out.print(num);
				num +=1;
			}
			System.out.println(" ");
		}
	}

}
