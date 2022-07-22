package PrototypePatten;

public class EmployeeRecord implements Prototype{
    private int Emp_num;
    private String Emp_name,Desig,Add;
    private double Sal;

    public EmployeeRecord(){
        System.out.println("Employee Records in ABC Company");
        System.out.println("==========================================");
        System.out.println("EmpId" + "\t" + "EmpName" + "\t\t" + "Designation" + "\t\t" + "Salary" + "\t\t" + "Address");
    }

    public EmployeeRecord(int Emp_num, String Emp_name, String Desig, double Sal, String Add) {
        this();
        this.Emp_num = Emp_num;
        this.Emp_name = Emp_name;
        this.Desig = Desig;
        this.Add = Add;
        this.Sal = Sal;
    }

    public void showRecord(){
        System.out.println(Emp_num + "\t" + Emp_name + "\t" + Desig + "\t" + Sal + "\t\t" + Add);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(Emp_num,Emp_name,Desig,Sal,Add);
    }
}
