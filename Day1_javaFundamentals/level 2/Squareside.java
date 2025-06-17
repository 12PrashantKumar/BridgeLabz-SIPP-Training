package emmersionlevel2;
import java.util.Scanner;
public class Squareside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double perimeter = sc.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " 
        + side + " whose perimeter is " + perimeter);
	}

}
