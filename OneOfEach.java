
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double a = Math.random();
		boolean girl = false ;
		boolean boy = false ; 
		int count = 0 ;

				while (girl==false || boy==false){

					if (a<0.5){
						count++ ;
						boy = true;
						System.out.print(" b");

					}
					if (0.5<a){
						count++;
						girl = true ;
						System.out.print(" g");
					}
					a = Math.random(); 

				}		
				System.out.println();
				System.out.println("You made it... and you now have " + count + " children");
			 

			

			} 


			}
			


					
