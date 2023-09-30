package SingleDimensionalArray;

class Main{
    public static void main(String[] args) {
        
        SingleDimensionalArray sda = new SingleDimensionalArray(10);

        //Insertion element in Array
        sda.insert(0, 0);   //Successfully Inserted
        sda.insert(1, 10);  //Successfully Inserted
        sda.insert(2, 20);  //Successfully Inserted
        sda.insert(1, 30);  //This cell is already occupied
        sda.insert(12, 120);//Invalid index to access array

        //Accessing element in Array
        var firstElement = sda.arr[0];          //---------------------------------------- O(1)
        System.out.println(firstElement); //10

        var thirdElement = sda.arr[2];          //---------------------------------------- O(1)
        System.out.println(thirdElement); //30

        //Time Complexity: O(1)
        //Space Complexity: O(1)


        //Traverse element in Array
        System.out.println("Array Traversal: ");
        sda.traverseArray(); //0 10 20 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 

        //Finding an element in Array
        System.out.println("Finding an element in array: ");
        sda.searchInArray(0); //Value is found at the index of 0
        sda.searchInArray(30); //30 is not found

        //Deleting an element in array
        System.out.println("Deleting an element in array: ");
        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
    }
}