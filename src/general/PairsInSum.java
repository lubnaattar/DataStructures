package general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PairsInSum {

	public void printPairsSums(int[] array, int sum) {
		Arrays.sort(array);

		int first = 0;
		int last = array.length - 1;

		while (first < last) {
			int s = array[first] + array[last];
			if (s == sum) {
				System.out.println(array[first] + " " + array[last] + " = Sum "
						+ sum);
				first++;
				last++;
			} else {
				if (s < sum) {
					first++;
				} else {
					last--;
				}
			}
		}
	}

	public void sumInPairsUsingHashmap(int[] array, int sum) {
		System.out.println("Using Hashmap");
		HashMap hm = new HashMap();
		for (int i = 0; i < array.length; i++) {
			hm.put(array[i], 0);
		}
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			int x = (int) me.getKey();
			int diff = sum - x;
			if(hm.containsKey(diff)){
				System.out.println("pairs : " + x + "+" + diff);
			}
			//System.out.println("Value = " + x);	
		}
	}
}
