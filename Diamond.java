/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
	    int n = 4;
	   
	    //   *
	    //  ***
	    // *****
	    for (int i = 1; i < n; i++){
	        for (int j = n-1; j > i; j--){
	            System.out.print("  ");
	        }
	        for (int k = 1; k < i; k++){
	            System.out.print("* ");
	        }
	        for (int j = 1; j <= i; j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
	    // *****
	    //  ***
	    //   *
	    for (int i = 1; i < n; i++){
	        for (int j = 1; j <= i; j++){
	            System.out.print("  ");
	        }
		    for (int j = i; j < n-1; j++){
		        System.out.print("* ");
		    }
		    for (int j = i; j < n-2; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		} 
	}
}
