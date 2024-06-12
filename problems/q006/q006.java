package q006;

public class q006 {
  public static void main(String[] args) {
    System.out.println(new q006().solve1());
    System.out.println(new q006().solve2());
  }

  /*
   * brute force calculate
   */
  public int solve1() {
    int n = 100;
    int sumOfSquares = 0;
    int squareOfSum = 0;

    for (int i = 1; i <= n; i++) {
      squareOfSum += i;
      sumOfSquares += i * i;
    }
    squareOfSum *= squareOfSum;
    return squareOfSum - sumOfSquares;
  }

  /*
   * using formulas
   */
  public int solve2() {
    int n = 100;
    return n * (n + 1) * (3 * n * n - n - 2) / 12;
  }
}
