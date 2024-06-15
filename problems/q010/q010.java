package q010;

public class q010 {
  public static void main(String[] args) {
    System.out.println(new q010().solve1());
    System.out.println(new q010().solve2());
  }

  /*
   * brute force
   */
  public long solve1() {
    long ans = 0;
    for (int i = 2; i <= 2000000; i++) {
      if (isPrime(i)) {
        ans += i;
      }
    }

    return ans;
  }

  private boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  /*
   * Sieve of Eratosthenes
   */
  public long solve2() {
    int n = 2000000;
    long sum = 0;
    for (int p : listPrimes(n + 1)) {
      sum += p;
    }

    return sum;
  }

  // Returns a Boolean array 'isPrime' where isPrime[i] indicates whether i is
  // prime, for 0 <= i <= n.
  private boolean[] listPrimality(int n) {
    boolean[] res = new boolean[n + 1];

    if (n >= 2) {
      res[2] = true;
    }

    for (int i = 3; i <= n; i += 2) {
      res[i] = true; // Assume all odd numbers are prime initially
    }

    // Sieve of Eratosthenes
    for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
      if (res[i]) {
        for (int j = i * i; j <= n; j += i * 2) {
          res[j] = false;
        }
      }
    }

    return res;
  }

  // Returns all the prime numbers less than or equal to n, in ascending order.
  private int[] listPrimes(int n) {
    boolean[] isPrime = listPrimality(n);
    int count = 0;

    for (boolean b : isPrime) {
      if (b)
        count++;
    }

    int[] result = new int[count];
    for (int i = 0, j = 0; i < isPrime.length; i++) {
      if (isPrime[i]) {
        result[j] = i;
        j++;
      }
    }

    return result;
  }
}
