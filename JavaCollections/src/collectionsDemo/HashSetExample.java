package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hsset=new HashSet<String>();
		hsset.add("USA");
		hsset.add("UK");
		hsset.add("INDIA");
		hsset.add("INDIA");
		System.out.println(hsset);
		Iterator <String>i= hsset.iterator();
		while(i.hasNext()){
			System.out.println();
			System.out.print(i.next());
			}

	}

}
