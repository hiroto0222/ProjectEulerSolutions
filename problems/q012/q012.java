package q012;

public class q012 {
  public static void main(String[] args) {
    System.out.println(new q012().solve1());
  }

  /*
   * brute force search until number of divisors > 500
   */
  public int solve1() {
    int triangle = 0;
    int i = 1; // ith triangle number
    while (triangle <= Integer.MAX_VALUE) {
      triangle += i;
      if (countDivisors(triangle) > 500) {
        return triangle;
      }
      i++;
    }

    return -1;
  }

  // counts the number of divisors from [1, n]
  private int countDivisors(int n) {
    int cnt = 0;
    int end = (int) Math.sqrt(n);
    for (int i = 1; i < end; i++) {
      if (n % i == 0) {
        cnt += 2;
      }
    }
    // if perfect square
    if (end * end == n) {
      cnt += 1;
    }

    return cnt;
  }
}
