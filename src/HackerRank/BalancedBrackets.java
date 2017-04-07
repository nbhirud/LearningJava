package HackerRank;

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println("t = "+t);
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println("expression = "+ expression);
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
      //System.out.println();
		in.close();
	}

	public static boolean isBalanced(String expression) {
      System.out.println("inside isBalanced. expression = "+expression);
		Stack<Character> stk = new Stack<>();
		boolean flag = true;
		for (int i = 0; (i < expression.length())&&(flag == true); i++) {
			String charStr = String.valueOf(expression.charAt(i));
          System.out.println("charStr = "+charStr);
			// String.valueOf(char )
			if ((charStr.equals("\\{")) || (charStr.equals("\\[")) || (charStr.equals("\\("))) {
				stk.push(expression.charAt(i));
              System.out.println("Pushed = "+expression.charAt(i));
              
			} else if(stk.size() > 0){
              String caseManager = String.valueOf(stk.pop());
              System.out.println("CaseManager = "+caseManager);
				switch (caseManager) {
				case "\\{":
					flag = (charStr) == "\\}" ? true : false;
                  System.out.println("pop() Case = \\{, charStr = "+charStr);
					break;

				case "\\[":
					flag = (charStr) == "\\]" ? true : false;
                  System.out.println("pop() Case = \\[, charStr = "+charStr);
					break;

				case "\\(":
					flag = (charStr) == "\\)" ? true : false;
                  System.out.println("pop() Case = \\(, charStr = "+charStr);
					break;
				}

		//		if (flag == false) {
		//			return false;
		//		}

			}

		}
                      
      System.out.println("flag = "+ flag);
		
      if (flag == false) {
			return false;
		} else {
			return true;
		}
	}
}
