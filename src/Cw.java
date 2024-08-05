import java.util.Arrays;
import java.util.Scanner;

public class Cw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int items = sc.nextInt();
        int[] myarray = new int[items];
        System.out.println("Enter values for array: ");
        for (int i = 0; i < items; i++) {
            myarray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(myarray));
    }
}
