package TwoDimensionalArray;

public class TwoDimensionalArray {
    int arr[][] = null;

    // constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // method
    // insert value in the 2D Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) { // ---------------------------------------- O(1)
                arr[row][col] = value; // ---------------------------------------- O(1)
                System.out.println("The value is successfully inserted.");// -------------------- O(1)
            } else {
                System.out.println("This cell is already occupied"); // ------------------------- O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array"); // -------------------------------- O(1)
        }
    }
    // Time Complexity: O(1)
    // Space Complexity: o(1)

    // method
    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing row: " + row + ", col:" + col); // -------------------------------- O(1)
        try {
            System.out.println("Cell value is: " + arr[row][col]); // -------------------------------- O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array"); // -------------------------------- O(1)
        }
    }
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    // method
    // traverse 2D Array
    public void traverseArray() {

        for (int row = 0; row < arr.length; row++) { // ------------------- O(m) }
            for (int col = 0; col < arr[0].length; col++) { // ------------------- O(n) } ----- O(mn)
                System.out.print(arr[row][col] + " "); // -------------------------------- O(1)
            }
            System.out.println(); // -------------------------------- O(1)
        }
    }
    //Time Complexity: O(mn)
    //Space Complexity: O(1)


    //method
    //Search for an element in 2D Array
    public void searchElementIn2DArray(int valueToBeSearch){
            for (int row = 0; row < arr.length; row++) { // -------------------------------- O(m)
                for (int col = 0; col < arr[0].length; col++) { // -------------------------------- O(n)
                    if(arr[row][col] == valueToBeSearch){ // -------------------------------- O(1)
                        System.out.println("Value is found at row: "+row+" col: "+col); // -------------------------------- O(1)
                        return;
                    }
                }
            }
            System.out.println("Value is not found"); // -------------------------------- O(1)
    }
    //Time Complexity: O(mn)
    //Space Complexity: O(1)


    //method
    //Deleting array element in 2D array
    public void deleteElementIn2DArray(int row, int col){
        try {
            System.out.println("Successfully Deleted: "+ arr[row][col]); // -------------------------------- O(1)
            arr[row][col] = Integer.MIN_VALUE; // -------------------------------- O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is not valid for array"); // -------------------------------- O(1)
        }
    }
    //Time Complexity: O(1)
    //Space Complexity: O(1)
}
