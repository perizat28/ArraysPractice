import java.util.Scanner;
public class Main {
    public static void main (String [] args){

        int [] values = {5, -3, 3,  8, -1, 0, 12, -7, 4, 2};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int currentVal : values){
            if (currentVal > 0){
                positive++;
            } else if (currentVal < 0) {
                negative ++;
            } else {
                zero++;
            }
        }
        System.out.println("Array: ");
        for (int currentVal : values){
            System.out.println(currentVal + " ");
        }
        System.out.println();

        System.out.println("Positive: "+ positive);
        System.out.println("Negative: "+ negative);
        System.out.println("Zero: "+ zero);
    }

}