package q015;

import java.math.BigInteger;

public class q015 {
  public static void main(String[] args) {
    System.out.println(new q015().solve1());
    System.out.println(new q015().solve2());
  }

  /*
   * Brute force dp approach
   */
  public long solve1() {
    int n = 20;
    long[][] dp = new long[n + 1][n + 1];
    dp[0][0] = 1;

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        dp[i][j] += i == 0 ? 0 : dp[i - 1][j];
        dp[i][j] += j == 0 ? 0 : dp[i][j - 1];
      }
    }

    return dp[n][n];
  }

  /*
   * Using combination
   */
  public String solve2() {
    return binomial(40, 20).toString();
  }

  private BigInteger binomial(int n, int k) {
    BigInteger prod1 = BigInteger.ONE;
    for (int i = 0; i < k; i++) {
      prod1 = prod1.multiply(BigInteger.valueOf(n - i));
    }
    BigInteger prod2 = BigInteger.ONE;
    for (int i = 2; i <= k; i++) {
      prod2 = prod2.multiply(BigInteger.valueOf(i));
    }
    return prod1.divide(prod2);
  }
}
