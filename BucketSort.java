
// This class can sort unsignedinteger via Bucket Sort.
// It contains a static method which can sort java arrays.
// The methods need two parameters: the array and the max value.
public class BucketSort {

	public static int[] sortArray(int[] arr, int max) {
		if (arr == null || max <= 0)
			throw new IllegalArgumentException();
		int[] temp = new int[max + 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				throw new InvalidValueException("A value in the array is less than 0\n");
			temp[arr[i]]++;
		}
		int[] def = new int[arr.length];
		int defIndex = 0;
		int tempIndex = 0;
		while (defIndex < def.length) {
			while (temp[tempIndex] > 0) {
				def[defIndex++] = tempIndex;
				temp[tempIndex]--;
			}
			tempIndex++;
		}
		return def;
	}
}
