package q003;

public class q003 {
  public static void main(String[] args) {
    System.out.println(new q003().solve1());
  }

  // brute force
  public long solve1() {
    long n = 600851475143L;
    for (long i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        n /= i;
      }
    }

    return n;
  }
}
