public class InOrder {
	public static void main (String[] args) {
		int range = (int)(Math.random()*10) ;
		int next = range;

		do{ 
			range = next;
			System.out.print(range + " ") ;
			next = (int)(Math.random()*10);

		}while (range <= next );
	}
}
