import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {
        
        // Given no. is n is Even or Odd.
        // Every number has to be converted in binary internally.
        //Suppose number = 7 in binary it would be 0111.
        //                                            ^ LSB(Least significent bit)
        //                                            |
        // As we know that for converting decimal to binary.
        // 2^4*0 + 2^2*1 + 2^1*1 + 2^0*1 = 7
        //By observing we find out that if the first number is One(1) then it would be Odd Number or it Zero(0) the it will be Even Number.


        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if ((num&1)==1) {
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}