package HackerRank;

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class BalancedBrackets {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        System.out.println("t = " + t);
//        for (int a0 = 0; a0 < t; a0++) {
//            String expression = in.next();
            String expression = "()(";
            System.out.println("expression = " + expression);
            //System.out.println((isBalanced(expression)) ? "YES" : "NO");
            System.out.println("Number of balanced brackets: "+ isBalanced(expression));
//        }
        //System.out.println();
//        in.close();
    }

    public static int isBalanced(String expression) {
//        int balancedCounter = 0;
        System.out.println("inside isBalanced. expression = " + expression);
        Stack<String> stk = new Stack<>();
        boolean flag = true;
//        if(expression.length()%2 == 1) {
//            return -1;
//        }
        
        for (int i = 0; (i < expression.length()) && flag ; i++) {
            //String charStr = String.valueOf(expression.charAt(i));
            String charStr = expression.substring(i, i+1);
            System.out.println("charStr = " + charStr);
            // String.valueOf(char )
          //  if (charStr.equals("\\{")) {
          if(charStr.equals(Character.toString((char) 123))) {
                stk.push("\\{");
                System.out.println("Pushed = " + expression.charAt(i));
 
            } 
            else if (charStr.equals(Character.toString((char) 91))){
                stk.push("\\[");
                System.out.println("Pushed = " + expression.charAt(i));

            }
            else if (charStr.equals(Character.toString((char) 40))) {
                stk.push("\\(");
                System.out.println("Pushed = " + expression.charAt(i));

            }
            else if (stk.size() > 0) {
                String caseManager = String.valueOf(stk.pop());
                System.out.print("Popped "+caseManager);
                System.out.println("CaseManager = " + caseManager);
                switch (caseManager) {
                    case "\\{":
                        flag = (charStr) == "\\}" ;
                        System.out.println("pop() Case = \\{, charStr = " + charStr);
                        break;

                    case "\\[":
                        flag = (charStr) == "\\]"  ;
                        System.out.println("pop() Case = \\[, charStr = " + charStr);
                        break;

                    case "\\(":
                        flag = (charStr) == "\\)"  ;
                        System.out.println("pop() Case = \\(, charStr = " + charStr);
                        break;
                }
//                if(flag == true) {
//                    balancedCounter++;
//                }

                //		if (flag == false) {
                //			return false;
                //		}
            }

        }
        
        if(!stk.isEmpty()) {
            flag = false;
        }

        System.out.println("flag = " + flag);

        if (flag) {
            return expression.length()/2;
        } else {
            return -1;
        }
    }
}
