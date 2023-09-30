/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns
 * the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place
 * with O(1) extra memory
 *
 * Example: 
 * Input: nums = [1, 1, 2]
 * Output: 2
 */
package Exercise;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        int count = removeDuplicates(nums);
        System.out.println(count);
    }

    public static int removeDuplicates(int[] nums){
        //Length of the updated array
        int count = 0;
        //Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            //If the current element is equal to the next element, we skip
            if(i<nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }
            //we will update the array in place
            nums[count] = nums[i];
            count++;
        }

        return count;
    }
}
