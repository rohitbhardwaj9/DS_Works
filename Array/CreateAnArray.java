import java.util.Arrays;

class CreateAnArray{
    public static void main(String[] args) {
        
        //declare
        int[] intArray;         //------------------------------------------------------- O(1)

        //instantiation
        intArray = new int[3];  //------------------------------------------------------- O(1)
       
        //initialization
        intArray[0] = 1;        //-------------------------- O(1) }
        intArray[1] = 2;        //-------------------------- O(1) } --------------------- O(N)
        intArray[2] = 3;        //-------------------------- O(1) }

        System.out.println(Arrays.toString(intArray));

        //all together
        String strArray[] = {"a", "b", "c"};    //--------------------------------------- O(1)
        System.out.println(Arrays.toString(strArray));
    }
}

//Hence, Time complexity will be: 
// O(1) + O(1) + O(N) + O(1) = O(N)