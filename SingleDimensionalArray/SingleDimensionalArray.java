package SingleDimensionalArray;

public class SingleDimensionalArray {

    int arr[] = null;

    // constructor
    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // method
    // Insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) { // ------------------------------- O(1)
                arr[location] = valueToBeInserted; // ------------------------------- O(1)
                System.out.println("Successfully Inserted"); // ------------------------------- O(1)
            } else {
                System.out.println("This cell is already occupied"); // ------------------------ O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array"); // ---------------------------- O(1)
        }
    }

    // Hence, Time complexity of insert() is:
    // O(1) + O(1) + O(1) + O(1) + O(1) = O(1)

    // method
    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {      //----------------------------------------- O(N)
                System.out.print(arr[i] + " ");       //----------------------------------------- O(1)
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist!");   //----------------------------------- O(1)
        }
    }
    //Time Complexity: O(N) + O(1) + O(1) = O(N)
    //Space Complexity: O(1)


    //method
    //Search for an element in the given array
    public void searchInArray(int valueToBeSearch){         
        for (int i = 0; i < arr.length; i++) {              //---------------------------------------- O(1)
            if(arr[i] == valueToBeSearch){                  //---------------------------------------- O(1)
                System.out.println("Value is found at the index of "+ i); //-------------------------- O(N)
                return;
            }
        }
        System.out.println(valueToBeSearch+" is not found"); //--------------------------------------- O(N)
    }
    //Time Complexity: O(N)+O(1)+O(1)+O(1) = (N)
    //Space Complexity: O(1)

    //method
    //Deleting an element from Array
    public void deleteValue(int valueToBeDeleteIndex){
        try {
            arr[valueToBeDeleteIndex] = Integer.MIN_VALUE;      //------------------------------------- O(1)
            System.out.println("The value has been deleted successfully");  //----------------------- O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array"); //-------- O(1)
        }
    }
    //Time Complexity: O(1)
    //Space Complexity: O(1)
}
