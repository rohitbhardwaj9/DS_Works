/*
 * Given 2D array calculate the sum of diagonal elements.
 * 
 * myArray2D = {{1,2,3},{4,5,6},{7,8,9}}
 * 
 * sumDiagonalElements(myArray2D) #15
 */
package Exercise;

public class Ex2DArrays {
    public static void main(String[] args) {
        int[][] myArray2D = {{1,2,3},{4,5,6},{7,8,9}};
        sumDiagonalElements(myArray2D);
    }

    private static void sumDiagonalElements(int[][] myArray2D) {
        int sum = 0;
        for (int i = 0; i < myArray2D.length; i++) {
            for (int j = 0; j < myArray2D[i].length; j++) {
                if(i==j){
                    sum += myArray2D[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
