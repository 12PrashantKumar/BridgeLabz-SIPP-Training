package emmersion;
import java.util.Scanner;
public class feecalculator2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    double fee;
    fee = sc.nextDouble();
    double discountPercent;

    
    discountPercent = sc.nextDouble();

    double discount = (fee * discountPercent) / 100;
    double finalFee = fee - discount;

    System.out.println("The discount amount is INR " 
    + discount + " and final discounted fee is INR " + finalFee);
}
}
