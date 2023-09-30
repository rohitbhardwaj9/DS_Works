package TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(1, 0, 20);
        tda.insertValueInTheArray(2, 0, 30);
        tda.insertValueInTheArray(0, 1, 40);
        tda.insertValueInTheArray(1, 1, 50);
        tda.insertValueInTheArray(2, 1, 60);
        tda.insertValueInTheArray(0, 2, 70);
        tda.insertValueInTheArray(1, 2, 80);
        tda.insertValueInTheArray(2, 2, 90);
        // System.out.println(Arrays.deepToString(tda.arr));

        tda.accessCell(2, 1);

        System.out.println("Traversal of 2D Array: ");
        tda.traverseArray();

        System.out.println("Search element in the given array: ");
        tda.searchElementIn2DArray(70);

        System.out.println("Deleting element from 2D Array: ");
        tda.deleteElementIn2DArray(1, 2);

        tda.traverseArray();
    }

}
