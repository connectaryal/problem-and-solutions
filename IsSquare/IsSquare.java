package IsSquare;

public class IsSquare {
  public static void main(String[] args) {
    System.out.println(isSquare(25)); // 1
    System.out.println(isSquare(8)); // 0
  }

  public static int isSquare(int n) {
    if (n < 0)
      return 0;

    if (n == 0)
      return 1;

    for (int i = 0; i < n / 2; i++) {
      if (i * i == n) {
        return 1;
      }
    }

    return 0;
  }
}
