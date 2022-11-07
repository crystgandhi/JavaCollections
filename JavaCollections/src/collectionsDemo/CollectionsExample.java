package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsExample {
    //print unique number
	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 5, 6, 9, 4, 6, 4, 5, 7 };

		int l = a.length;

	ArrayList<Integer> arrList2 = new ArrayList<Integer>();

		for (int i = 0; i < l; i++) {
			int k = 0;
			if (!arrList2.contains(a[i])) {
				arrList2.add(a[i]);
				k++;
			 for (int j = i + 1; j < l; j++) {
				if (a[i] == a[j])
					k++;
			}System.out.println(k);
			System.out.println(a[i]);
		   }
		
	
		}

	}
}