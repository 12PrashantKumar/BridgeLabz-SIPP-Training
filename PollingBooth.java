package bridgelabz.workshop;

import java.util.Scanner;

public class PollingBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vote;
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        System.out.println("---- Welcome to Polling Booth ----");
        System.out.println("Enter -1 as age to exit the system.");

        while (true) {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Enter your vote (1, 2, or 3 for candidates): ");
                vote = sc.nextInt();

                if (vote == 1) {
                    candidate1++;
                } else if (vote == 2) {
                    candidate2++;
                } else if (vote == 3) {
                    candidate3++;
                } else {
                    System.out.println("Invalid vote! Vote not counted.");
                }
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        System.out.println("\n--- Voting Summary ---");
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
        System.out.println("Candidate 3: " + candidate3 + " votes");

        sc.close();
    }
}
