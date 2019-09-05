import java.util.ArrayList;

public class Application2 {
	public static void main(String[] args) {
		
//Adding 
	ArrayList<Integer>numbers=new ArrayList<Integer>();
		
// Retrieving		
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
	
		
		System.out.println(numbers.get(0));

	// Indexed for loop iteration	

	
		for (int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
			 
		}
		
		
		//removing
		numbers.remove(numbers.size()-1);
		
		numbers.remove(2);
		
		
		
		
	}

}