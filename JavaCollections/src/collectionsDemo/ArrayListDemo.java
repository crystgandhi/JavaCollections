package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		/*ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		List al= new ArrayList();*/
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(34.9);
		al.add('k');
		al.add(true);
		al.add(0, 67);
		System.out.println(al);
		int size=al.size();
		System.out.println(size);
		al.remove(2);
		System.out.println(al);
		al.add(2, "Katty");
		System.out.println(al);
		System.out.println(al.get(3));
		al.set(4, "SunShine");
		System.out.println(al);
		System.out.println(al.contains('k'));
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		for(Object e:al) {
			System.out.print(e+", ");
		}
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println();
			System.out.print(it.next());
		}
		
	}

}
