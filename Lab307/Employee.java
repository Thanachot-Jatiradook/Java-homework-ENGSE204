package Lab307;

public class Employee {

    private String employeeId ;
    private String department ;

    public Employee(String emplpyeeId, String department) {

        this.employeeId = emplpyeeId ;
        this.department = department ;

    }

    public String getEmployeeId() {

        return this.employeeId ;

    }

    public String getDepartment() {

        return this.department ;

    }

    public void setDepartment(String newDepartment) {

        this.department = newDepartment ;

    }
    
}
