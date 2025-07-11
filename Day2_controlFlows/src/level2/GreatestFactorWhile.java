import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
           //Input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int counter = number - 1;
        int greatestFactor = 1;
// Condition
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
    }
}

