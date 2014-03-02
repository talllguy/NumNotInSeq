import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Elliott Plack
 *
 */
public class SequenceCheck {

	/**
	 * @param args		main class
	 * @param ArrayList	ArrayList setup
	 * @param sequence	sequence of integers that will be used
	 * 					throughout the program
	 * @param getInput	gets the input
	 * @param findNumberNotIn	finds a number not in the sequence
	 */
	public static void main(String[] args) { 
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence = getInput(sequence); // call method to get the input for the sequence
		findNumberNotIn(sequence); // call method to find a number not in the sequence
	}

	private static ArrayList<Integer> getInput(ArrayList<Integer> sequence) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence of real numbers: ");
		System.out.println("Type any non integer to stop.");
		// note that a "sequence" is implied to be sequential. No sorting is done for simplicity.
		while (sc.hasNextInt())
			sequence.add(sc.nextInt());
	    sc.close();
		return sequence;
	}

	private static void findNumberNotIn(ArrayList<Integer> sequence) {
		int match = 0;
		int first = sequence.get(0);
		int size = sequence.size();
		for (int i = 0; i < size; i++)
		{
			if ((first + i) != sequence.get(i)) {
			    match = (first + i);
			    break;
			}
		}
		System.out.println(match + " is not in the sequence.");
	}
	
}
