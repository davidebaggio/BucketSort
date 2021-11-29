import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		Random rn = new Random();
		int size = 1000000;
		int[] numbers = new int[size];
		int max = 1000;
		for (int i = 0; i < size; i++) {
			int rand = rn.nextInt(max + 1);
			numbers[i] = rand;
		}
		long init = System.currentTimeMillis();
		int[] sortedNumbers = BucketSort.sortArray(numbers, max);
		long end = System.currentTimeMillis();
		/*
		 * for (int i = 0; i < numbers.length; i++) { //
		 * System.out.print(sortedNumbers[i] + " "); }
		 */
		System.out.println("\nThe time needed to sort " + size + " element with BucketSort is: "
				+ ((double) end - (double) init) / 1000.0 + " s");

	}
}