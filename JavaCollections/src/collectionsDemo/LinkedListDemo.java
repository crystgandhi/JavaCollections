package collectionsDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(4,900);
	
		System.out.println(l.contains(400));
		l.set(3, 50);
		l.add(4,400);
		System.out.println(l.isEmpty());
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(3));
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		for(Object e:l) {
			System.out.print(e+", ");
			
		}
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println();
			System.out.print(it.next());
			}
		Collections.sort(l);
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		System.out.println(l.getFirst());

	}

}
