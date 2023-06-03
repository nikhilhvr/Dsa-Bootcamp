import java.util.Scanner;

public class squareRoot {

    // Find Square Root of a Number Using Binary Search
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Any Number: ");
        float num = sc.nextFloat();
        System.out.println(" Square Root of " + num + " is: " + sqrt(num));
    }

    static float sqrt(float num) {
        // Simple Binary Search to Find the Square Root
        float start = 0;
        float end = num;
        while (start <= end) {
         
            float mid = start + (end - start) / 2;
            if (mid * mid == num)
                return mid;
            else if (mid * mid > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        return end;
    }
}