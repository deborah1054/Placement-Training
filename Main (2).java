import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                count++;
            } else if (a.charAt(i) == ')') {
                count--;
            }
            // If at any point count is negative, it's unbalanced
            if (count < 0) {
                System.out.println("not balanced");
                return;
            }
        }
    }
    
}
    

