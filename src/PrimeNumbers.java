public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int n = 2; n <= 500; n++) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}