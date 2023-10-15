
import java.util.*;
class PanGram {

	static int size = 26;

	static boolean isLetter(char ch)
	{
		if (!Character.isLetter(ch))
			return false;

		return true;
	}

	
	static boolean allLetter(String str,
							int len)
	{
		
		str = str.toLowerCase();

		
		boolean[] present = new boolean[size];

		for (int i = 0; i < len; i++) {

			
			if (isLetter(str.charAt(i))) {

				
				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}

		for (int i = 0; i < size; i++) {

			
			if (!present[i])
				return false;
		}
		return true;
	}

	
	public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("PLEASE ENTER  THE INPUT : "); 


		String str = sc.nextLine(); 
		
		int len = str.length();

		if (allLetter(str, len))
			System.out.println("YES,THE GIVEN INPUT IS PANGRAM");
		else
			System.out.println("NO,THE GIVEN INPUT IS NOT PANGRAM");
	}
}
