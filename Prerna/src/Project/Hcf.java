package Project;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num1=36;
		  int num2=60; 
		  int hcf=0;

		    for (int i=1;i<=num1 || i<=num2;i++)
		      {
		     if (num1%i==0 && num2%i==0)
		        hcf=i;
		      }

		    System.out.println("HCF: "+ hcf);
		  }
		

	}


