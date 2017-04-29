/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Arrays;

/**
 *
 * @author nbhirud
 */

// This code finds the length of the longest subsequence of the numbers in the array where the consequtive numbers are either same or differ by 1.
public class TicketProblem {

    public static void main(String[] args) {
        int[] list = {4, 13, 2, 3};
        int max = maxTickets(list);
        System.out.println(max);
    }

    static int maxTickets(int[] tickets) {
        int max = 1;
        int currMax = 1;
        int pastNum;
        Arrays.sort(tickets);
        if (tickets.length == 0) {
            return 0;
        } else {
            pastNum = tickets[0];
        }
        for (int i = 1; i < tickets.length; i++) {
            if (Math.abs(tickets[i] - pastNum) < 2) {
                currMax++;
            } else {
                currMax = 1;
            }
            pastNum = tickets[i];
            if (max < currMax) {
                max = currMax;
            }
        }
        return max;
    }
}
