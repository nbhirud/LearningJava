package dataStructures;

public class StackUsingArray {
	private int stackMaxSize;
	private int topOfStack;
	private String[] theStackArray;
	private int stackCurrSize;
	
	public StackUsingArray(int maxSize) {
		super();
		this.stackMaxSize = maxSize;
		this.topOfStack = -1;
		this.stackCurrSize = 0;
		this.theStackArray = new String[maxSize];;
	}
	
	public boolean push(String str) {
		boolean status = false;
		if ((topOfStack < stackCurrSize)&&(stackCurrSize < stackMaxSize)) {
			theStackArray[++topOfStack] = str;
			stackCurrSize++;
			status = true;
		}
		System.out.println(status?str+" inserted": "Stack overflow. Not inserted");
		return status;
	}
	
	public String pop() {
		String str = "Nothing popped - The Stack is empty";
		if(topOfStack > -1) {
			str = theStackArray[topOfStack--];
			stackCurrSize--;
		}
		return str; 
	}
	
	public void printStack() {
		System.out.println("---------");
		System.out.print(stackCurrSize > 0 ? "Stack:\t" : "Stack Empty.");
		for(int i = 0; i< stackCurrSize; i++) {
			System.out.print(theStackArray[i]+"\t");
		}
		System.out.println();
		System.out.println("----------");
	}
}



