import java.util.Scanner;

public class eculidsAlgorithm {
    
    public static int gcd(int a ,int b) {

        if (a==0) {
            return b;
            
        }
        if (b==0) {
            return a;
            
        }
        while (a !=b) {
            if (a>b) {
                a = a-b;
                
            }
            else{
                b =b-a;
            }
        }
        return a;
        
    }
    public static void main(String[] args) {
        //GCD formula gcd =(a-b,b)

        // int a,b;
        System.out.println("Enter the value of a and b");
        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.format("The GCD of %d and %d is : %d ",a,b,gcd(a, b));


    }

}
