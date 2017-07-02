/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nbhirud
 */
public class AnagramDifference {

    public static void main(String[] args) {
//        String[] a = {"aa", "ad", "aas", "ghv"};
//        String[] b = {"aa", "ac", "aasa", "sdf"};
        String[] a = {"hhpddlnnsjfoyxpci",
            "xulkowreuowzxgnhmiqekxhz",
            "dnqaurlp",
            "aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqra",
            "lbafwuoawkxydlfcbjjtxpzpchzrvbtiev",
            "drngbjuuhmwqwxrinxccsqxkp",
            "ubu",
            "vxxzsqjqsnibgydzlyynqcrayvw",
            "xtnipeqhxvafqaggqoanvwk",
            "gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvz"};

        String[] b = {
            "ioigvjqzfbpllssuj",
            "istdocbnyozmnqthhpievvlj",
            "lofnrtmh",
            "sqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb",
            "qbpedlqbktorypcjkzzkodrpvosqzxmpad",
            "wygwcdbtriwaesjsobrntzaqbe",
            "lzt",
            "jurfsqfrivayopgrxewwruvemzy",
            "mthtfirwhmjrbphlmeluvoa",
            "nspiwquxxsiwuldizqkkaawpyyisnftdzklwagv"};

        for (int i : getMinimumDifference(a, b)) {
            System.out.print(i + " ");
        }
    }

    static int[] getMinimumDifference(String[] a, String[] b) {

        HashMap<Character, Integer> hma = new HashMap<>();
        HashMap<Character, Integer> hmb = new HashMap<>();
        int[] out = new int[a.length];
        for (int listCounter = 0; listCounter < a.length; listCounter++) {
            if (a[listCounter].length() != b[listCounter].length()) {
                out[listCounter] = -1;
                continue;
            }

            for (int i = 0; i < a[listCounter].length(); i++) {
                if (hma.containsKey(a[listCounter].charAt(i))) {
                    hma.put(a[listCounter].charAt(i), hma.get(a[listCounter].charAt(i))+1);
                } else {
                    hma.put(a[listCounter].charAt(i), 1);
                }
            }
            for (char c : hma.keySet()) {
                System.out.println(c + ", " + hma.get(c));
            }
            System.out.println("");
            System.out.println("");
            for (int i = 0; i < b[listCounter].length(); i++) {
                if (hmb.containsKey(b[listCounter].charAt(i))) {
                    hmb.put(b[listCounter].charAt(i), hmb.get(b[listCounter].charAt(i))+1);
                } else {
                    hmb.put(b[listCounter].charAt(i), 1);
                }
            }
            for (char c : hmb.keySet()) {
                System.out.println(c + ", " + hmb.get(c));
            }
            int countChanges = 0;
            for (Character cha : hma.keySet()) {
                if ((hmb.containsKey(cha)) && (cha != null)) {
                    //int o = (hmb.containsKey(cha)? hmb.get(cha): 0);
                    //int min = Math.min(hma.get(cha),  hmb.get(cha));
//                    System.out.print("cha = "+ cha);
//                    System.out.print(", hma.get(cha) = "+ hma.get(cha));
//                    System.out.println(", hmb.get(cha) = "+hmb.get(cha));
                    int an = (hma.get(cha) == null ? 0 : hma.get(cha));
                    int bn = (hmb.get(cha) == null ? 0 : hmb.get(cha));
                    countChanges += Math.abs(an - bn);
//                    hma.remove(cha);
//                    hmb.remove(cha);
//                    hma.put(cha, hma.get(cha) - min);
//                    hmb.put(cha, hmb.get(cha) - min);
                }
            }

            for (Character in : hma.keySet()) {
                hma.put(in, 0);
                hmb.put(in, 0);
                //countChanges += (hma.get(in) == null ? 0: hma.get(in));
            }
            for (Character in : hmb.keySet()) {
                countChanges += (hmb.get(in) == null ? 0 : hmb.get(in));
            }

            /*            
            int countChanges = 0;
            List<Integer> la = (List<Integer>) hma.values();
            List<Integer> lb = (List<Integer>) hmb.values();
            
            for(Integer in : la) {
                countChanges += in;
            }
            for(Integer in : lb) {
                countChanges += in;
            }

             */
            out[listCounter] = countChanges;

        }
        return out;
    }
}
