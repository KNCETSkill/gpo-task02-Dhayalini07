import java.util.Scanner;
  public class AttendanceStatusEvaluator{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
        System.out.println("Enter Student Attendance Percentage:");
        if(num>85){
          System.out.println("Excellent");
          }
            else if(num>60 && num<85){
            System.out.println("Satisfactory");
          }
            else if(num<60){
            System.out.println("Poor");
          }
        sc.close();
          }
  }
         
