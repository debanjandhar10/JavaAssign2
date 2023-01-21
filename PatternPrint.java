/**
* 4. Write a Program using loop to print following pattern
*/
public class PatternPrint {
  public static void main(String[] args) {
    int lines = 3;
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j < i; j++)
            System.out.print(" ");
        for (int k = lines; k >= i; k--)
            System.out.print("* ");
        System.out.println();
    }
  }
}
