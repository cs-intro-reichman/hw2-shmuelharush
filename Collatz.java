// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		int number = 1; 
		int count = number;
		System.out.print( number + " ");
		for(int i = 0 ; i <= seed ;i++ ){
			if(number%2 ==0){
			number = number/2;
			System.out.print(number + " ");	
	
			}else{
				number = (number*3)+1;
				System.out.print(number + " ");
			}
			if( number == 1){
				count ++;
				System.out.println( " ");
				System.out.print(count + " ");
				number = count;

				
			}
		}
			
		
				
	 }
	}

