package Project;

public class Transposing {

	public static void main(String[] args) {
		int[][]a ={{1,2},{4,5},{8,9}};
		int[][]transpose= new int[2][3];
		
		for(int i=0;i<2;i++)   //i=row
		{
			for(int j=0;j<2;j++)    //j=column
			{
				transpose[i][j]=a[j][i];     //transposed
			}
			
		}
		System.out.println(" transposed matrix:");  
		for(int i=0;i<2;i++){    
		for(int j=0;j<2;j++){  
			System.out.print(transpose[i][j]+" ");    
	}
		System.out.println();   

}
		}
	}