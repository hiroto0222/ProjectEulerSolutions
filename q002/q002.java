package q002;

public class q002 {
  public static void main(String[] args) {
    System.out.println(new q002().solve1());
  }

  // brute force
  public int solve1() {
    int sum = 0;
    int x = 1; // current fib
    int y = 2; // next fib
    while (x <= 4000000) {
      if (x % 2 == 0) {
        sum += x;
      }
      int z = x + y;
      x = y; // update current fib
      y = z; // update next fib
    }

    return sum;
  }
}
