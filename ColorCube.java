import java.util.*;

// Parent class
class Number {
    int n;

    void setNumber(int x) {
        n = x;
    }
}

// Child class to find square
class Square extends Number {
    void area() {
        System.out.println("The square value is : " + (n * n));
    }
}

// Child class to find cube
class Cube extends Number {
    void area() {
        System.out.println("The cube value is : " + (n * n * n));
    }
}

public class ColorCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side : ");
        int a = sc.nextInt();
        Square s = new Square();
        s.setNumber(a);
        s.area();

        Cube c = new Cube();
        c.setNumber(a);
        c.area();
    }
}


