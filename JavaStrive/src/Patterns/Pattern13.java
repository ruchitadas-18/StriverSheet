package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6; 
		int num =1;
		for(int i=0; i<a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(num);
				num +=1;
			}
			System.out.println(" ");
		}
		
	}
}
