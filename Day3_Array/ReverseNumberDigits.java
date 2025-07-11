import java.util.Scanner;
public class ReverseNumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        System.out.print("Reversed digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}