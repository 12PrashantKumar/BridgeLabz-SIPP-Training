package bridgelabz.workshop;

import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String coffeeType;
        int quantity;
        double price = 0, bill, gstRate = 0.18, totalWithGST;

        do { 
            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino / Mocha) or 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = Integer.parseInt(sc.nextLine());

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                case "mocha":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type! Try again.");
                    continue;
            }

            bill = price * quantity;
            double gst = bill * gstRate; 
            totalWithGST = bill + gst;

            System.out.println("Base Amount: ₹" + bill);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Total Bill: ₹" + totalWithGST);

        } while (true);

        System.out.println("\nCafe closed for the day. Thank you!");
        sc.close();
    }
}




