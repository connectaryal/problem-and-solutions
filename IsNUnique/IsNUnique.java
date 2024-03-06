package IsNUnique;

public class IsNUnique {
  public static void main(String[] args) {
    int[] a = { 7, 3, 3, 2, 4 };
    int n = 5;
    System.out.println(isNUnique(a, n));
  }

  static int isNUnique(int[] a, int n) {
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > n) {
        continue;
      }

      for (int j = i + 1; j < a.length; j++) {
        if (a[j] > n) {
          continue;
        }

        if (a[i] + a[j] == n) {
          count++;
        }
      }
    }

    if (count == 1) {
      return 1;
    } else {
      return 0;
    }
  }

}
