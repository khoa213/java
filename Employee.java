public class Employee extends Staff implements ICalculator {
    private double timeWorkMore;

    public double getTimeWorkMore() {
        return timeWorkMore;
    }

    public double calculateSalary() {
        return Math.round((super.getSalaryFactor() * 3000000 + timeWorkMore * 200000)*100)/100 ;
    }

    @Override
    public void displayInformation() {
        System.out.println(super.getId()+"             "+super.getName()+"                 "+super.getAge()+"               "+super.getSalaryFactor()+"                 "
                +super.getDayStartWork()+"             "+super.getDayOff()+"                        "+ super.getDepartment()+"                "+timeWorkMore+
                "                                " +this.calculateSalary());
    }
    public Employee (String id,String name,int age,double salaryFactor,String dayStartWork,int dayOff,String department,double timeWorkMore) {
        super(id,name,age,salaryFactor,dayStartWork,dayOff,department);
        this.timeWorkMore = timeWorkMore;
    }

}
