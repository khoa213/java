public class Manager extends Staff implements ICalculator {
    private String position;
    private double positionSalary;

    public String getPosition() {
        return position;
    }

    @Override
    public void displayInformation() {
        System.out.println(super.getId()+"             "+super.getName()+"                  "+super.getAge()+"                 "+super.getSalaryFactor()+"                "
                +super.getDayStartWork()+"                "+super.getDayOff()+"                      "+ super.getDepartment()+"             "+position+
                "                     "+this.calculateSalary());
    }
    public double calculateSalary() {
        if (position=="Business Leader") {
            positionSalary = 8000000;
        } else if (position=="Project Leader") {
            positionSalary = 5000000;
        } else if (position=="Technical Leader") {
            positionSalary = 6000000;
        }
        return Math.round((super.getSalaryFactor() * 5000000 + positionSalary)*100)/100 ;
    }
    public Manager (String id,String name,int age,double salaryFactor,String dayStartWork,int dayOff,String department,String position) {
        super(id,name,age,salaryFactor,dayStartWork,dayOff,department);
        this.position = position;
    }
}
