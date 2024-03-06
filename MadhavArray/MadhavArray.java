package MadhavArray;

public class MadhavArray {
  public static int sumFactor(int[] a) {
    int sum = 0;
    int totalNo = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    for (int j = 0; j < a.length; j++) {
      if (a[j] == sum) {
        totalNo++;
      }
    }
    return totalNo;
  }

  public static void main(String[] args) {
    int[] a = { -1, 1, 1 };
    System.out.println(sumFactor(a));
  }
}