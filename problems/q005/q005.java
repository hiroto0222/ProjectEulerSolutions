package q005;

public class q005 {
  public static void main(String[] args) {
    System.out.println(new q005().solve1());
  }

  /*
   * using lcm
   */
  public int solve1() {
    int n = 1;
    for (int i = 2; i <= 20; i++) {
      n = this.lcm(n, i);
    }

    return n;
  }

  private int lcm(int a, int b) {
    return (a / this.gcd(a, b)) * b;
  }

  // euclidean algorithm
  private int gcd(int a, int b) {
    if (a == 0)
      return b;

    return this.gcd(b % a, a);
  }
}
