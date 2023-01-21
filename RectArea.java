/**
* 2. Find rectangle area, reading length and breadth from console
*/
import java.util.Scanner;
public class RectArea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    float length = sc.nextFloat();
    System.out.print("Enter the breadth of the rectangle: ");
    float breadth = sc.nextFloat();
    float area = length * breadth;
    System.out.println("Area: " + area);
  }
}
