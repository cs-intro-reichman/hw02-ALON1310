/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = 0 ;

			while (b < a){
				
				for (int c = 0; c<a;c++){

				if (b%2==0){
					System.out.print("* ");
					
					}
					else if(b%2!=0) {
						System.out.print(" *");
				
				}
				
				
			}		
				b++;	
					System.out.println();
			}
		}
	}