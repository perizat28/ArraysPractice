import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        int[] values = {12, 5, 28, 3, 19, 7, 15, 9};
        int largest = values[0];
        int largestIndex = 0;
        int smallest= values[0];
        int smallestIndex = 0;

        for (int  i = 1; i < values.length; i++){
            if (values[i] > largest){
                largest = values[i];
                largestIndex = i;
            }
            if (values[i] < smallest){
                smallest = values[i];
                smallestIndex = i;
            }
        }
        System.out.println("array: ");
        for (int currentVal : values){
            System.out.println(currentVal+ " ");
        }
        System.out.println();
        System.out.println("Largest: "+ largest + "at index" +largestIndex);
        System.out.println("Smallest: "+ smallest + "at index"+ smallestIndex);
    }
}
