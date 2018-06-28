package helloworld;

public class TestCountSquarePairs {

	public static void main(String[] args) {
		System.out.println(countSquarePairs(new int[] {11, 5, 4, 20}));
		System.out.println(countSquarePairs(new int[] {2, 7, 2, 2}));
		System.out.println(countSquarePairs(new int[] {9, 0, 2, -5, 7}));
		System.out.println(countSquarePairs(new int[] {9}));
		System.out.println(countSquarePairs(new int[] {2, 7, 0, 1, 5, 1}));
	}

	static int countSquarePairs(int[] a) {
		if (a.length < 2) {
			return 0;
		}
		
		int countSquarePairsResult = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= 0) {
				continue;
			}
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] <= 0) {
					continue;
				}
	
				
				int checkNumber = a[i] + a[j];
				if (isPerfectSquare(checkNumber) == 1) {
					countSquarePairsResult+=2;
				}
			}
		}

		return countSquarePairsResult;

	}

	static int isPerfectSquare(int n) {
		int i = 0;
		int square;
		do {
			square = i * i;
			i++;
		} while (square < n);

		return square == n ? 1 : 0;
	}
}
