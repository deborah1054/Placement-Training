import java.util.*;

class Grandfather {
    String grandfatherName;

    void setGrandfather(String name) {
        this.grandfatherName = name;
    }

    void displayGrandfather() {
        System.out.println("Grand Father is " + grandfatherName);
    }
}

class Father extends Grandfather {
    String fatherName;

    void setFather(String name) {
        this.fatherName = name;
    }

    void displayFather() {
        System.out.println("Father is " + fatherName);
    }
}

class Son extends Father {
    String sonName;

    void setSon(String name) {
        this.sonName = name;
    }

    void displaySon() {
        System.out.println("Son is " + sonName);
    }
}

public class FamilyTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String grandfather = sc.nextLine();
        String father = sc.nextLine();
        String son = sc.nextLine();
        
        Son s = new Son();
        s.setGrandfather(grandfather);
        s.setFather(father);
        s.setSon(son);
        
        s.displayGrandfather();
        s.displayFather();
        s.displaySon();
    }
}
