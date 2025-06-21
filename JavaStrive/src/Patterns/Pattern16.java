package Patterns;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6;
		char b = 'A';
		for(int i=1; i<a; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(b);
			}
			System.out.println(" ");
			b+=1;
		}

	}

}
