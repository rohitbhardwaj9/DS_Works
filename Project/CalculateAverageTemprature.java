package Project;

import java.util.Scanner;
class CalculateAverageTemprature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temprature: ");
        int numDays = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= numDays; i++) {
            System.out.print("Day "+i+"'s high temprature: ");
            int next = sc.nextInt();
            sum = sum+next;
        }

        double average = sum / numDays;
        System.out.println();
        System.out.println("Average temprature is "+average);

        sc.close();
    }
}