public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        int count = 0;
        for(int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int m = p * p; m <= n; m += p) {
                    isPrime[m] = false;
                }
            }
        }
        for(int m = 0; m < isPrime.length; m++) {
            if(isPrime[m] == true)
            count++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        for(int g = 0; g < isPrime.length; g++) {
            if(isPrime[g] == true)
            System.out.println("" + g);
        }
        double percent = (count * 100.0 / n) ;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)percent + "% are primes)" );
    }
}