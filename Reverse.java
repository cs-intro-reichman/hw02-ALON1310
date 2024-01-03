public class Reverse {
	public static void main (String[] args){
		String a = args[0] ;
		String revers = "" ;
		int n = a.length()  ;

		for (int i = n-1 ; i >= 0  ; i--) {
			revers += a.charAt(i) ;

		}
		System.out.println(revers) ;
		System.out.println("The middle character is " + revers.charAt(n/2)) ;



	}
}
