import java.util.Arrays;
import java.util.Random;

public class ArrShuf {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int rSwap = rand.nextInt(array.length);
			int temp = array[rSwap];
			array[rSwap] = array[i];
			array[i] = temp;
		}
		
		
		System.out.println("The shuffled array is :");
		System.out.println(Arrays.toString(array));
	}
}

/*      cloudvandana assignment - java problem 1, array shuffling 
         assignment done  by prasad_saila / prasadsaila169@gmail.com  */