package Com.bridgelab.day8.Emplyeewage;
import java.util.*;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int a = random.nextInt(2);
        int wagePH = 20;
        int FulldayH = 8;
        if(a == 1)
            System.out.println("Employee is Present\nPer day Wage is: "+(wagePH*FulldayH));
        else
            System.out.println("Employee is Absent\nPer day Wage is: 0");

    }
}
