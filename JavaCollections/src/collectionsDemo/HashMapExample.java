package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Java");
		hm.put(2, "Phython");
		hm.put(3, "Ruby");
		System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(3);
		System.out.println(hm);
		Set hmset=hm.entrySet();
		Iterator it=hmset.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}
}
