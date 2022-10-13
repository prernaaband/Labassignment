package Project;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
        System.out.println("enter the number:");
	    Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		 /*1
		   12
		   121
		   12321
		  */
	
		for(int i=1; i<=n;i++) // i= row
		{
			for(int k=1; k<=i;k++) //k=column
			{
				System.out.print(k);  //k=column
			}for(int k=i-1; k>=1;k--) //k=column
			{
				System.out.print(k);  //k=column
			}
			
		System.out.println();
	
	}

	}
}


