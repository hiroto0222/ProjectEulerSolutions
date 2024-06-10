package q004;

public class q004 {
  public static void main(String[] args) {
    System.out.println(new q004().solve1());
    System.out.println(new q004().solve2());
  }

  /*
   * brute force 100*100 to 999*999
   */
  public int solve1() {
    int ans = -1;
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        int curr = i * j;
        if (this.isPalindrome(String.valueOf(curr)) && curr > ans) {
          ans = curr;
        }
      }
    }

    return ans;
  }

  private boolean isPalindrome(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
  }

  /*
   * the largest palindrome number must be between [10000, 998001]
   * as majority of numbers are 6 digits, consider only 6 digits
   */

  public int solve2() {
    int ans = -1;

    for (int diff, q, p = 999; p >= 100; p--) {
      if (p % 11 == 0) {
        q = 999;
        diff = 1;
      } else { // q must be a multiple of 11
        q = 990;
        diff = 11;
      }

      for (; q > 99; q -= diff) {
        int curr = p * q;
        if (this.isPalindrome(curr) && curr > ans) {
          ans = curr;
        }
      }
    }

    return ans;
  }

  private boolean isPalindrome(int x) {
    int n = 0;
    int orig = x;
    while (x > 0) {
      n = n * 10 + x % 10;
      x = x / 10;
    }
    return n == orig;
  }
}
