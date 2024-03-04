package MadhavArray;

public class MadhavArray {
  public static int isMadhavArray(int[] a) {
    int len = a.length;
    int sum = 0;
    int n = 1;

    while (n * (n + 1) / 2 <= len) {
      sum = 0;
      for (int i = n * (n + 1) / 2 - 1; i < len; i++) {
        sum += a[i];
        if (sum != n * (n + 1) / 2 - 1) {
          return 0;
        }
      }
      n++;
    }
    return 1;

  }

  public static void main(String[] args) {
    int[] a = { 2, 1, 1 };
    System.out.println(isMadhavArray(a));
  }
}
