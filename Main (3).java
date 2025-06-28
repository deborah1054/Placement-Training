import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] a = new int[n];
        int count = 0;
        
        // Read array and count 1's
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                count++;
            }
        }
        
        // Print all 1's
        for (int i = 0; i < count; i++) {
            System.out.print("1 ");
        }
        
        // Print remaining 0's
        for (int i = 0; i < n - count; i++) {
            System.out.print("0 ");
        }
        
        System.out.println();  // move to next line after output
    }
}


