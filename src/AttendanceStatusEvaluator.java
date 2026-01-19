import java.util.Scanner;
public class AttendanceStatusEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attendance = sc.nextInt();
        if (attendance > 85) {
            System.out.print("Excellent");
        } 
        else if (attendance >= 60 && attendance <= 85) {
            System.out.print("Satisfactory");
        } 
        else {
            System.out.print("Poor");
        }
    }
}

