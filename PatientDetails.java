import java.util.*;

class Patient {
    String pname;
    int bed_no;
    int wardno;

    void getPatientdetails(Scanner sc) {
        System.out.println("Enter Patient Name :");
        pname = sc.nextLine();
        System.out.println("Enter Bed Number :");
        bed_no = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Ward Name :");
        wardno = Integer.parseInt(sc.nextLine());
    }
}

class Doctor extends Patient {
    String dname;
    String degree;
    int due;

    void getDoctordetails(Scanner sc) {
        System.out.println("Enter the Doctor Name :");
        dname = sc.nextLine();
        System.out.println("Enter Doctorate Degree :");
        degree = sc.nextLine();
        System.out.println("Enter Dues of Patient :");
        due = Integer.parseInt(sc.nextLine());
    }

    void Details() {
        System.out.println("Inserted Data");
        System.out.println("Patient Name : " + pname);
        System.out.println("Bed Number : " + bed_no);
        System.out.println("Ward Name : " + wardno);
        System.out.println("Doctor Name : " + dname);
        System.out.println("Doctorate Degree : " + degree);
        System.out.println("Total Dues of Patient : " + due);
    }
}

public class PatientDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data");
        Doctor d1 = new Doctor();
        d1.getPatientdetails(sc);
        d1.getDoctordetails(sc);
        d1.Details();
    }
}

