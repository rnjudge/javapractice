import java.util.Scanner;

public class Fibonacci	
{
        public static void main( String[] args )
        {
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Enter a number to calculate the fibonacci series with.");
		int ans = keyboard.nextInt();
		calculateFib(ans);

	} 

	// num is how many outputs of the fib sequence you want
	// For example: num=4 would output 0, 1, 1, 2
	public static void calculateFib( int num )
	{
		// Cannot calculate negative numbers
		if ( num <0 ) {
			System.out.println(" Cannot compute negative numbers ");
			return;
		}

		int i, previous, current, fib;
		for(i = 0,previous = 0,current = 1,fib = 0; i < num; i++)
		{
			if (i == 0) {
				System.out.print( " 0");
			} else{
				fib = previous+current;
				System.out.print( " " + fib + " " );
				current = previous;
				previous = fib;
			}
		} //for
		System.out.println(" "); // Print a blank line
	} // calculateFib

} // Fibonacci
