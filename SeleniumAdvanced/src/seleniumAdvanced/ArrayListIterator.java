package seleniumAdvanced;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		 languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    languages.add("Swift");
		    System.out.println(languages);
		    
		    Iterator<String> iterate = languages.iterator();
//		    Boolean str=iterate.hasNext();
//		    System.out.print("ArrayList: "+str);
		    
		    while(iterate.hasNext()){
		        System.out.print(iterate.next()+"  ");
		        
		      }
	}

}
