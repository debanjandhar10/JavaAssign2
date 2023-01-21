/**
* 3. Use enhanced for loop to find the sum of array elements
*/
public class SumOfArrayElem {
  public static void main(String[] args) {
    float[] arr = {1.10f, 2.20f, 3.30f};
    double sum = 0;
    for(float elem: arr)
      sum += elem;
    System.out.println("Sum of Float Array Elements: " + sum);  
  }
}
