/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int children2 = 0 ; 
		int children3 = 0 ;
		int children4 = 0 ;
		int total = 0;


		for (int i = 0 ; i < T ; i++){


			double a = Math.random();
			boolean girl = false ;
			boolean boy = false ; 
			int count = 0 ;


				while (girl==false || boy==false){

						if (a<0.5)	{
						count++ ;
						boy = true;
						total++;
									}
						if (0.5<=a){
						count++;
						girl = true ;
						total++;
										}

						a = Math.random(); 
					}

									if (count==2){
									children2++;
													}
									if (count==3){
										children3++;
													}
									if (4<=count){
											children4++;
														}
								
                                    }

							double evrage = (double)total/T ;
							System.out.println("Average: " + evrage + " children to get at least one of each gender.");
							System.out.println("Number of families with 2 children: "+ children2);
							System.out.println("Number of families with 3 children: "+ children3);						
							System.out.println("Number of families with 4 or more children: "+ children4);
							if ((children2>children3)&&(children2>children4)){
								System.out.println("The most common number of children is 2.");
							}
							else if ((children3>children2)&&(children3>children4)){
								System.out.println("The most common number of children is 3.");
							}
							else if ((children4>children2)&&(children4>children3)){
								System.out.println("The most common number of children is 4.");
							

	}	
	



		}
}
	

