public class reverse_integer {
    
    public static void main(String[] args) {
        int x =55321;
        int answer =0;
        while (x!=0) {
            int digit = x%10;
            if ((answer>Integer.MAX_VALUE/10)||(answer<Integer.MIN_VALUE/10)) {
                System.out.println("0");
                
            }
            answer = (answer*10)+digit;
            x = x/10;

        }

        System.out.println(answer);
    }
}