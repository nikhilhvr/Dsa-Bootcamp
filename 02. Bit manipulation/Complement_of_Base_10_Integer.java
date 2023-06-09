/**
 * Complement_of_Base_10_Integer
 */
public class Complement_of_Base_10_Integer {

    public static void main(String[] args) {
        int n =5;
        int numOne =n;
        int mask =0;
        if(n==0){
            System.out.println("1");
        }
        while(numOne!=0){
            mask = ((mask<<1) | 1);
            numOne = numOne>>1;
        }
        int answer = (~n)&mask;
        System.out.println(answer);
    }
}