package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("K");
		al.add("O");
		al.add("N");
		al.add("Y");
		al.add("W");
		al.add("L");
		al.add("G");
		al.add("T");
		System.out.println(al);
		ArrayList dupal=new ArrayList();
		dupal.addAll(al);
		System.out.println(dupal);
		dupal.removeAll(dupal);
		System.out.println(dupal);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
		String arr[]= {"cat", "rat", "dog","kite"};
		for(String e:arr) {
			System.out.print(e+", ");
		}
		
		ArrayList alist=new ArrayList(Arrays.asList(arr));
		System.out.println();
		System.out.println(alist);
	}

}
