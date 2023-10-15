
import java.util.*;

public class RomanConvert {
	
	int value(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	
	int romanToDecimal(String str)
	{
		
		int res = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			
			int s1 = value(str.charAt(i));

			
			if (i + 1 < str.length()) 
			{
				int s2 = value(str.charAt(i + 1));

				
				if (s1 >= s2) 
				{
					
					res = res + s1;
				}
				else
				{
					
					res = res + s2 - s1;
					i++;
				}
			}
			else
			{
				res = res + s1;
			}
		}
		if (res == -1){
			System.out.println(" *****PLEASE ENTER A VALID ROMAN NUMBER***** ");
		}

		return res;
	}

	
    
	
	
	
	
	
	public static void main(String args[])
	{
		RomanConvert ob = new RomanConvert();
        Scanner sc= new Scanner(System.in);
        System.out.print("PLEASE ENTER  ROMAN NUMBER : "); 


		String str = sc.nextLine(); 
        
		System.out.println("DECIMAL FORM OF ROMAN NUMBER " + " IS : " + ob.romanToDecimal(str));
	}
}



/*      cloudvandana assignment - java problem 2, roman number shuffling
         assignment done  by prasad_saila / prasadsaila169@gmail.com  */