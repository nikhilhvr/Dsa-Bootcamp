public class primeOrNotPrime {

    public static boolean isPrime() {
        int n = 11;
        if (n <= 1) {
            return false;

        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime());
    }

}
