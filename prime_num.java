public class prime_num {
    public static void main(String[] args) {
        System.out.println(isPrime(20));
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (n == 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
