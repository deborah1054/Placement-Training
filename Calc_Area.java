import java.util.*;

class Number {
    int n;

    void setNumber(int x) {
        n = x;
    }
}
class Square extends Number {
    void area() {
        System.out.println("Square of " + n + " is: " + (n * n));
    }
}

class Cube extends Number {
    void area() {
        System.out.println("Cube of " + n + " is: " + (n * n * n));
    }
}

public class Calc_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int a = sc.nextInt();
        Square s = new Square();
        s.setNumber(a);
        s.area();

        System.out.print("Enter an integer number: ");
        int b = sc.nextInt();
        Cube c = new Cube();
        c.setNumber(b);
        c.area();
    }
}

