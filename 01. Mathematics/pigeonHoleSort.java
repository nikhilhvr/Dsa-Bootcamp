import java.util.*;

public class pigeonHoleSort {

	public static void pigeonhole_sort(int numArr[],
			int n) {
		int min = numArr[0];
		int max = numArr[0];
		int range, i, j, index;

		for (int a = 0; a < n; a++) {
			if (numArr[a] > max)
				max = numArr[a];
			if (numArr[a] < min)
				min = numArr[a];
		}

		range = max - min + 1;
		int[] phole = new int[range];
		Arrays.fill(phole, 0);

		for (i = 0; i < n; i++)
			phole[numArr[i] - min]++;
		index = 0;

		for (j = 0; j < range; j++)
			while (phole[j]-- > 0)
				numArr[index++] = j + min;

	}

	public static void main(String[] args) {
		pigeonHoleSort sort = new pigeonHoleSort();
		int[] numArr = { 3, 12, 2, 2, 14, 16, 21 };

		System.out.print("Sorted order of NumArr : ");

		sort.pigeonhole_sort(numArr, numArr.length);

		for (int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i] + " ");
	}

}
