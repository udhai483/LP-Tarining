package PrototypePatten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtoTypeDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee Id: ");
        int emp_id = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String emp_name = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String emp_designation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double emp_sal = Double.parseDouble(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String emp_add = br.readLine();
        System.out.print("\n");

        EmployeeRecord emp1 = new EmployeeRecord(emp_id,emp_name,emp_designation,emp_sal,emp_add);

        emp1.showRecord();
        System.out.println("\n");
        EmployeeRecord emp2 = (EmployeeRecord) emp1.getClone();
        emp2.showRecord();
    }
}
