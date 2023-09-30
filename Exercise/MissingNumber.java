/*
 * Write java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range,
 * of 0 to n, with one missing number, and returns the missing number.
 * 
 * Example:
 *      myArray = {1,2,3,4,6}
 *      findMissingNumberInArray(myArray, 6)
 * 
 * Hint:
 *      Use the formula (n*(n+1))/2
 *      Which calculates the sum of the first n natural numbers.
 */
package Exercise;

public class MissingNumber {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray, myArray.length+1));
    }

    private static int findMissingNumberInArray(int[] myArray, int n) {
        int expectedSum = n*(n+1) / 2;

        int actualSum = 0;
        for (int num : myArray) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
