/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nbhirud
 */
public class MyCalculator {
    int power(int n, int p) throws Exception {
        if(n<0 || p<0) {
            throw new Exception("n and p should be non-negative");
        }
        return (p==0)? 1 : n*power(n, p-1);
    }
}

class Solution {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        String line = "";
        //int n = 0, p = 0;
        while(sc.hasNext()) {
            line = sc.nextLine();
            String[] st = line.split(" ");
            try {
                int pow = mc.power(Integer.parseInt(st[0]), Integer.parseInt(st[1]));
                System.out.println(pow);
            } catch (Exception ex) {
                //Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
    }
}
