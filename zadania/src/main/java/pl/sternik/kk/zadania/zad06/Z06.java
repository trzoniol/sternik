package pl.sternik.kk.zadania.zad06;

public class Z06 {
	public static void main(String[] args) {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };

		System.out.println("Maximum: " + findMax(values));
		System.out.println("Minimum: " + findMin(values));
	}
	public static int findMax(int[][] values) {
		int max;

		max = values[0][0];

		for (int[] is : values) {
			for (int i : is) {
				if (i >= max) {
					max = i;
				}
			}
		}
		return max;
	}
	public static int findMin(int[][] values) {
		int min;

		min = values[0][0];

		for (int[] is : values) {
			for (int i : is) {
				if (i <= min) {
					min = i;
				}
			}
		}
		return min;
	}

}
