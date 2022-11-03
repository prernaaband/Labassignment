package Project;
import java.util.ArrayList;
import java.util.List;

public class Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<Integer>();
		
		number.add(112);
		number.add(391);
		number.add(444);
		number.add(643);
		number.add(875);
		
		
		number.forEach((O)->{
			
			if(O%2==1)
				System.out.println("This number is Odd: " + O);
		});
		 number.forEach((E)->{
	            if(E%2==0)
	              System.out.println("This is even number: " + E);


		});

		

	}
}


