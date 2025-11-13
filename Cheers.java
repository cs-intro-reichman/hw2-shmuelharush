


public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            int time =  Integer.parseInt(args[1]);
            int i = 0;
            String wordsOut = "AEFHILMNORSX";
              

            while(i<name.length()){
             
                if(wordsOut.indexOf(name.charAt(i)) == -1){
                System.out.println("Give me a " + name.charAt(i) +  ": "  + name.charAt(i) + "!" );
               
                }else{
                  System.out.println("Give me an " + name.charAt(i) +  ": "  + name.charAt(i) + "!" ); 
                     
                  
                }
                i++;
               

          
               
  

            }
            System.out.println( "What does that spell?" );
             int y = 0 ;
            do { 
                System.out.println( name + " !!!");
                y++;
            } while (y< time);
            
        }
}
