public class Department {

    private String departmentID;
    private String departmentName;
    private int numberOfStaff = 0;

    public String getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void toString1() {


        System.out.println(departmentID+"                 "+departmentName+"            "+ HumanResources.count);
    }
    public void toString2() {
        System.out.println(departmentID+"                 "+departmentName+"           "+ HumanResources.count1);
    }
    public void toString3() {
        System.out.println(departmentID+"                "+departmentName+"                     "+ HumanResources.count2);
    }
    public Department (String departmentID,String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

}
