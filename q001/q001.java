package q001;

public class q001 {
  public static void main(String[] args) {
    System.out.println(new q001().solve1());
    System.out.println(new q001().solve2());
  }

  /*
   * the upper bound sum is 1000 * 1000 = 10^6
   * which fits within a Java integer of 2^31 - 1
   * so brute force
   */
  public int solve1() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }

    return sum;
  }

  /*
   * instead of brute force, we can use the gauss summation formula
   */
  public double solve2() {
    return this.gaussSum(999, 3) + this.gaussSum(999, 5) - this.gaussSum(999, 15);
  }

  private double gaussSum(int n, int k) {
    return 0.5 * k * Math.floor(n / k) * (Math.floor(n / k) + 1);
  }
}
