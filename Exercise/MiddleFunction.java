/*
 * Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
 * myArray = [1,2,3,4]
 * middle(myArray)
 */
package Exercise;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int[] result = middle(myArray);
        System.out.println(Arrays.toString(result));
    }

    private static int[] middle(int[] myArray) {
        if(myArray.length < 3){
            return new int[0];
        }

        int[] middleArray = new int[myArray.length - 2];
        for (int i = 1; i < myArray.length-1; i++) {
            middleArray[i-1] = myArray[i];
        }

        return middleArray;
    }
}
