/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author nbhirud
 */
public class Solution {

    public List<Integer> getAnagramIndices(String haystack, String needle) {
        List<Integer> list = new ArrayList<>();

        haystack = haystack.trim();
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();
        needle = stringSort(needle); //sorted needle;
        int nLen = needle.length();
        int hLen = haystack.length();

        //HashMap<String, Integer> hm = new HashMap<>();

        if (hLen < nLen) {
            return null;
        }

        for (int i = 0; i < hLen - nLen; i++) {
            
            //hm.put(stringSort(haystack.substring(i, i + nLen)), i);
            
            if (needle.equals(stringSort(haystack.substring(i, i + nLen)))) {
                list.add(i);
            }
        }
        return list;
    }

    public String stringSort(String s) {
        Collator col = Collator.getInstance(new Locale("en", "EN"));
        //String s = "AbaC";
        String[] s1 = s.split("");
        Arrays.sort(s1, col);
        String sorted = "";
        for (int i = 0; i < s1.length; i++) {
            sorted += s1[i];
        }
        //System.out.println(sorted);
        return sorted;
    }
}
