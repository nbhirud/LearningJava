/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.HashMap;

/**
 *
 * @author nbhirud
 */
public class ElectionWinnerClass {
    public static void main(String[] args) {
        //String[] votes = {"Nikhil", "Sachin", "Nikhil"};
        String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"};
        String op = electionWinner(votes);
    }

    private static String electionWinner(String[] votes) {
        //String op = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Counts the number of occurrences of each String (name) in the input array
        for(String s: votes) {
            if(hm.containsKey(s)) {
                //hm.put(s, (hm.get(s)+1));
                hm.replace(s, (hm.get(s)+1));
            }
            else {
                hm.put(s, 1);
            }
        }
        
        //finds the largest count in the hash map.
        int maxValue = 0;
        for(String s: hm.keySet()){
            if(hm.get(s) > maxValue) {
                maxValue = hm.get(s);
            }
        }
        
        String names = "";
        //finds the names with the largest count in hash map
        for(String s: hm.keySet()) {
            if(hm.get(s) == maxValue) {
                names = names+s+" ";
            }
        }
        //removes the last whitespace
        names = names.trim();
        System.out.println(names);
        
        //finds the largest string (alphabetically)
        String maxName = "";
        int i = 0;
        for(String s: names.split(" ")) {
            if(i == 0) {
                maxName = s;
            }else if (s.compareTo(maxName) > 0) {
                maxName = s;
            }
        }
        
        return maxName;
    }
    
}
