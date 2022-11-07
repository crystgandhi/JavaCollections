package seleniumAdvanced;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> myList=new LinkedList <Integer>();
		myList.add(56);
		myList.add(1, 45);
		myList.addFirst(88);
		myList.addLast(23);
		boolean check=myList.contains(45);
		int num=myList.get(2);
		int num1=myList.getLast();
		System.out.println("num= " +num);
		System.out.println("num1= "+num1);
		int num3=myList.peek();
		myList.poll();
		int num4 =myList.peekFirst();
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(check);
		System.out.println(myList);
	}

}
