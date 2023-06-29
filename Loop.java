import java.util.Scanner;
import java.util.*;

/*Write a program that does the following:
Asks the user for 5 numbers
Stores them in an array list
Finds the sum, product, largest, and smallest of those numbers
*/
public class Loop {
    public static void main(String[] args) {
     int a[]  = {1,2,3,4,5};
     int b[] = new int[10];
     for (int i=0; i<a.length;i++){
         System.out.println(a[i]);
     }
        System.out.println("Five numbers is " + a.length);
        System.out.println("Sum "  + Arrays.stream(a).sum());
        System.out.println("largest " + Arrays.stream(a).max());
        System.out.println("smallest " + Arrays.stream(a).min());


}
}