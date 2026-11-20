import java.util.Scanner;
public class task4 {
    public static void main(String[] args){

        int[] values = {3, 8, 12, 5, 9, 2, 7};

        System.out.println("Original: ");
        for (int currentVal : values){
            System.out.println(currentVal+ " ");
        }
        System.out.println();

        System.out.println("Reversed: ");
        for(int index = values.length - 1; index >= 0; index--){
            System.out.println(values[index] + " ");
        }
        System.out.println();
    }
}
