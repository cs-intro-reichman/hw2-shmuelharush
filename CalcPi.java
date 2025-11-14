// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args)
	 { 
       
	   int rounds = Integer.parseInt(args[0]);
	   int Denominator = 1;
	   double approximatedPi = 0;


       for (int i = 0; i < rounds; i++)
	    {
          
		  {

            if (i % 2 == 0) 
			{
               approximatedPi = approximatedPi + (1.0/Denominator);
			   

            }        
               
			  else 
			  {
                   approximatedPi = approximatedPi - (1.0/Denominator);
               }

           Denominator = Denominator +2 ;


			}

			
			

	    }

		approximatedPi = approximatedPi *4 ;
		  
		   System.out.println("pi according to Java: 3.141592653589793");
		   System.out.println("pi, approximated:     " + approximatedPi);
	}
}
