import java.util.Scanner;
import java.util.ArrayList;
public class OddEven {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("odd:"+ odd);
        System.out.println("even:"+ even);
    }
}
