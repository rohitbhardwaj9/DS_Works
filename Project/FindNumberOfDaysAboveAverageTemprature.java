package Project;

import java.util.Scanner;

public class FindNumberOfDaysAboveAverageTemprature {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temprature: ");
        int numDays = sc.nextInt();

        //record temprature and find average
        int[] temps = new int[numDays];

        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Day "+(i+1)+"'s high temprature: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }

        double average = sum / numDays;
        int above = 0;
        //Count days above average
        for (int i = 0; i < temps.length; i++) {
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average temprature is "+average);
        System.out.println(above+" days are above the average temprature");

        sc.close();
    }
}
