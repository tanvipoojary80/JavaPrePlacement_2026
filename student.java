import java.util.Scanner;
class Student {
    String name, usn;
    double cgpa;
}
public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Name: ");
            s[i].name = sc.next();
            System.out.print("USN: ");
            s[i].usn = sc.next();
            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }
        System.out.println("\nStudent Details");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].name + " " +s[i].usn + " " + s[i].cgpa);
        }
        sc.close();
    }
}