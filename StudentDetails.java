import java.util.*;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        int op = 0;
        while (op != 5) {
            System.out.println("\n1.Add\n2.del\n3.sort\n4.display\n5.terminate");
            op = sc.nextInt();
            sc.nextLine(); 

            String name;

            if (op == 1) {
                name = sc.nextLine();
                students.add(name);
                sc.nextLine(); 
            }

            if (op == 2) {
                name = sc.nextLine();
                students.remove(name);
                sc.nextLine(); 
            }

            if (op == 3) {
                Collections.sort(students);
                sc.nextLine(); 
            }

            if (op == 4) {
                for (String s : students) {
                    System.out.println(s);
                    sc.nextLine(); 
                }
            }

            if (op == 5) {
               sc.nextLine(); 
            }
        }
    }
}



