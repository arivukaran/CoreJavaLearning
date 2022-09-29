public class Employee {

    private int EmpNo;
    private String Name;
    private  int DepNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int empNo) {
        EmpNo = empNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDepNo() {
        return DepNo;
    }

    public void setDepNo(int depNo) {
        DepNo = depNo;
    }
    public void Display() {
        System.out.println("EmpNo:" + getEmpNo() + "  89Emp Name:" + getName() + " Dept:" + getDepNo() );
    }
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpNo(100);
        e1.setName("Prabhakaran");
        e1.setDepNo(4001);

        e1.Display();

        Employee e2 = new Employee();
        e1.setEmpNo(101);
        e1.setName("Kaavya");
        e1.setDepNo(4002);

        e1.Display();
    }
}
