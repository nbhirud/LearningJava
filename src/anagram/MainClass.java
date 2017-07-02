/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.List;

/**
 *
 * @author nbhirud
 */
public class MainClass {
    public static void main(String[] args) {
        Solution s = new Solution();
        //List<Integer> li = s.getAnagramIndices("abdcghbaabcdij", "bcda");
        List<Integer> li = s.getAnagramIndices("bbbababaaabbbb", "ab");
        for(Integer i: li) {
            System.out.print(i+" ");
        }
    }
    
}
