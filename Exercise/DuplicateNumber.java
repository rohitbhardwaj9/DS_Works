/*
 * Write a function which takes integer array as a parameter and returns a new integer array with unique elements.
 * (remove duplicates)
 * 
 * removeDuplicates({1,1,2,2,3,4,5})
 * output: []
 */

package Exercise;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] myArray = {1,1,2,2,3,4,5};
        int[] uniqueArray = removeDuplicates(myArray);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] myArray){

        int n = myArray.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < n; j++) {
                if(myArray[i]==myArray[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArray[index++] = myArray[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }
}
