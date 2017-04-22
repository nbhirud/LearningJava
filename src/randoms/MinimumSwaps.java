
package randoms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class MinimumSwaps {

    public static void main(String[] args) {

        int[] arr = {3,3,1,2};
        int s = minimumSwaps(arr);
        System.out.println(s);

    }

    static int minimumSwaps(int[] popularity) {
        int swapCount = 0;
        
        if(popularity.length == 0) {
            return 0;
        }

        for (int i = 0; i < popularity.length - 1; i++) {

            if (popularity[i] < popularity[i + 1]) {
                swapCount++;
                
                int temp = popularity[i];
                popularity[i] = popularity[i+1];
                popularity[i+1] = temp;

            }
        }

        return swapCount;
    }


}
