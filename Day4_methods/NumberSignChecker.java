import java.util.Scanner;
public class NumberSignChecker {
    public static int checkNumber(int n) {
        if(n < 0) return -1;
        else if(n > 0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = checkNumber(n);
        if(result == -1) System.out.println("Negative");
        else if(result == 1) System.out.println("Positive");
        else System.out.println("Zero");
    }
}
