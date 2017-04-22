package dataStructures;

import java.util.ArrayList;

public class StackUsingArrayList {
	private ArrayList<String> theStackArrayList = new ArrayList<>();;

	public void push(String str) {
		theStackArrayList.add(str);
		System.out.println(str+" inserted");
	}
	
	public String pop() {
		String str = "Nothing popped - The Stack is empty";
		if(theStackArrayList.size()>0) {
			str = theStackArrayList.get(theStackArrayList.size()-1);
			theStackArrayList.remove(theStackArrayList.size()-1);
		}
		//System.out.println("Popped:\t"+ str);
		return str; 
	}
	
	public void printStack() {
		String printStr = "";
		System.out.println("---------");
		System.out.print(theStackArrayList.size()>0 ? "Stack:\t" : "Stack Empty.");
		for(String s : theStackArrayList) {
			printStr = printStr + s + "\t";
		}
		System.out.println(printStr);
		System.out.println("----------");
	}
}



