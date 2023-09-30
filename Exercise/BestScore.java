/*
 * Given an array, write a function to get first, second best scores from the array and return it in new Array.
 * 
 * Array may contain duplicates.
 * Example: myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 * firstSecond(myArray)
 */
package Exercise;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScore(myArray)));
    }

    private static int[] findTopTwoScore(int[] myArray) {
     
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : myArray) {
            if(score > firstHighest){
                secondHighest = firstHighest;
                firstHighest = score;
            }else if(score > secondHighest && score < firstHighest){
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}
