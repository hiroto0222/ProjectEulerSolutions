package q014;

public class q014 {
  public static void main(String[] args) {
    System.out.println(new q014().solve1());
  }

  /*
   * Brute force search
   */
  public int solve1() {
    int maxCnt = 0;
    int res = -1;
    for (int n = 13; n < 1000000; n++) {
      int curr = collatzSequenceSize(n);
      if (curr > maxCnt) {
        maxCnt = curr;
        res = n;
      }
    }

    return res;
  }

  // counts the sequence of collatz, assuming all starting values reach 1
  private int collatzSequenceSize(long n) {
    int cnt = 0;
    while (n != 1) {
      if (n % 2 == 1) {
        n = 3 * n + 1;
      } else {
        n /= 2;
      }
      cnt++;
    }

    return cnt;
  }
}
