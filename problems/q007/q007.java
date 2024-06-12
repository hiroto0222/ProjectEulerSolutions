package q007;

public class q007 {
  public static void main(String[] args) {
    System.out.println(new q007().solve1());
  }

  /*
   * solving through brute force
   */
  public int solve1() {
    for (int i = 2, cnt = 0;; i++) {
      if (this.isPrime(i)) {
        cnt++;
        if (cnt == 10001) {
          return i;
        }
      }
    }
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
}
