package Patterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =5;
		for(int i=0; i<N; i++) {
			 for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++){
	              
	              System.out.print(ch);
	          }
			System.out.println(" ");
		}

	}

}
