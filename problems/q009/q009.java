package q009;

public class q009 {
  public static void main(String[] args) {
    System.out.println(new q009().solve1());
  }

  /*
   * brute force search
   * satisfy a < b < c during search
   */
  public int solve1() {
    for (int a = 1; a < 1000; a++) {
      for (int b = a + 1; b < 1000; b++) {
        int c = 1000 - a - b;
        if (a * a + b * b == c * c) {
          return a * b * c;
        }
      }
    }

    return -1;
  }
}
