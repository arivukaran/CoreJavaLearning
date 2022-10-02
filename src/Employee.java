public class Employee {

    private int EmpNo;
    private String Name;
    private Department department;

    public void setName(String name) {
        Name = name;
    }

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int empNo) {
        EmpNo = empNo;
    }

    public String getName() {
        return Name;
    }

    public void Display() {
        System.out.println("EmpNo:" + getEmpNo() + "  89Emp Name:" + getName() + " Dept:" + department.getDeptNo() );
    }
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpNo(100);
        e1.setName("Prabhakaran");

        try {
            e1.department.setDeptNo(100);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer exception caught");
        }
        e1.Display();

        Employee e2 = new Employee();
        e2.setEmpNo(101);
        e2.setName("Kaavya");
        e2.department.setDeptNo(102);
        e2.Display();
    }
}
