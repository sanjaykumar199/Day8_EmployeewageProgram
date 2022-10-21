package Com.bridgelab.day8.Emplyeewage;
import java.util.*;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");

        Random random = new Random();
        int a = random.nextInt(2);
        if(a == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
