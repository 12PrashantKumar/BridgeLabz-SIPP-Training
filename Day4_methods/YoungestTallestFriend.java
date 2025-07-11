import java.util.Scanner;
public class YoungestTallestFriend {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < min) min = ages[i];
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > max) max = heights[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for(int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for(int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}
