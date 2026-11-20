import java.util.Scanner;

public class task3 {
    public static void main (String[] args){
        int[] values = {10, 20, 30, 40, 50, 60};

        int sum = 0;
        for(int currentVal: values){
            sum += currentVal;
        }
        double average = (double) sum / values.length;
        int aboveAverage = 0;
        for (int currentVal : values){
            if (currentVal > average){
                aboveAverage++;
            }
        }
        System.out.println("Array: ");
        for (int currentVal : values){
            System.out.println(currentVal+ " ");
        }
        System.out.println();
        System.out.println("Average "+ average);
        System.out.println("Numbers above average: "+ aboveAverage);
    }
}
