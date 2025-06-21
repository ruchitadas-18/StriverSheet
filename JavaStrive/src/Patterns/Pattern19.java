package Patterns;

public class Pattern19 {
	public static void main(String[]args) {
		 int iniS = 0;
		 int N = 6;
	      for(int i=0;i< N;i++){
	          
	          //for printing the stars in the row.
	          for(int j=1;j<=N-i;j++){
	              System.out.print("*");
	          }
	          
	          //for printing the spaces in the row.
	          for(int j=0;j<iniS;j++){
	              System.out.print(" ");
	          }
	          
	          //for printing the stars in the row.
	          for(int j=1;j<=N-i;j++){
	              System.out.print("*");
	          }
	          
	          // The spaces increase by 2 every time we hit a new row.
	          iniS+=2;
	          
	          System.out.println();
	      }
	      
	}
}
