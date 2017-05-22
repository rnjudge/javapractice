import java.util.Scanner;

public class Palindrome
{

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string of characters with no spaces:");
		// TO DO -- NOTE: doesn't protect against empty input
		// Will continue to print blank lines until valid input entered.
		String input = keyboard.next();
		if ( isPalindrome(input) )
			System.out.println("Your string IS a Palindrome");
		else
			System.out.println("Your string is NOT a Palindrome");

	}

	public static boolean isPalindrome( String word )
	{
		boolean ans = false;

		// base case
		if ( word.length() <= 1 )
			return !ans; //true

		// Don't forget: Strings are 0 indexed. 
		// We actually want n-1 for the index
		int i, end;
		for (i = 0,end = word.length() - 1; i <= end; i++,end--) {
			if (word.charAt(i) == word.charAt(end))
				continue;
			else
				return ans; // false
		}

		return !ans; //true
	
	}
}
