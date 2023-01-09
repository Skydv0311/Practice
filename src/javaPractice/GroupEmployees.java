package javaPractice;

class Employee{
    int empId;
    String empName;
    String location;

    public Employee(int empId, String empName, String location) {
        this.empId = empId;
        this.empName = empName;
        this.location = location;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getLocation() {
        return location;
    }
}
public class GroupEmployees {

}
