import java.util.Arrays;

class TwoDimensionalArray{
    public static void main(String[] args) {
//step1 - declare
        int[][] int2DArray;     //------------------------------------------------------- O(1)

        //step2 - instantiate
        int2DArray = new int[2][2]; //--------------------------------------------------- O(1)

        //step3 - initialization
        int2DArray[0][0] = 1;   //----------------------------------------- O(1) }
        int2DArray[0][1] = 2;   //----------------------------------------- O(1) } ------ O(mn)
        int2DArray[1][0] = 3;   //----------------------------------------- O(1) }
        int2DArray[1][1] = 4;   //----------------------------------------- O(1) }

        System.out.println(Arrays.deepToString(int2DArray));

        //All together
        String str2DArray[][] = {{"a", "b"}, {"c", "d"}}; //------------------------------ O(1)
        System.out.println(Arrays.deepToString(str2DArray)); 

        //Time Complexity: O(mn)
        //Space Complexity: O(mn)
    }

}
