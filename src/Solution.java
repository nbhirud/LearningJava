
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String, Integer> mag = new HashMap<>();

        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            String temp = in.next();
            if (temp.matches("[a-zA-Z]")) {
                magazine[magazine_i] = temp;
                if (mag.containsKey(magazine[magazine_i])) {
                    int oldValue = mag.get(magazine[magazine_i]);
                    mag.replace(magazine[magazine_i], oldValue, oldValue + 1);
                } else {
                    mag.put(magazine[magazine_i], 1);
                }
            }
        }

        String ransom[] = new String[n];
        HashMap<String, Integer> ran = new HashMap<>();
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            String temp = in.next();
            if (temp.matches("[a-zA-Z]")) {
                ransom[ransom_i] = temp;
                if (ran.containsKey(ransom[ransom_i])) {
                    int oldValue = ran.get(ransom[ransom_i]);
                    ran.replace(ransom[ransom_i], oldValue, oldValue + 1);
                } else {
                    ran.put(ransom[ransom_i], 1);
                }
            }

        }

        Boolean flag = false;
        for (String s : ran.keySet()) {
            if (mag.containsKey(s)) {
                if (mag.get(s) >= ran.get(s)) {
                    flag = true;
                    continue;
                }
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        in.close();
    }
}
