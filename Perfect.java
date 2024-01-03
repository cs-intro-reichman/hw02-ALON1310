/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int N = Integer.parseInt(args[0]) ;
	String text = ( N + " is a perfect number since " + N + " = 1" ) ;
	int num1 = 1;

		for (int i = 2 ; i < N ; i++){
			if (N%i==0){
				num1 += i ;
				text = text + " + " + i ;
			}
		}
			if (num1==N){
				System.out.println(text);
			}
			else{
				System.out.println(N + " is not a perfect number");
			}
		}
	}