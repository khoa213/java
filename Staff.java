public abstract class Staff {
    private String id;
    private String name;
    private int age;
    private double salaryFactor;
    private String dayStartWork;
    private String department;
    private int dayOff;
    public abstract void displayInformation();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getSalaryFactor() {
        return salaryFactor;
    }

    public String getDayStartWork() {
        return dayStartWork;
    }

    public String getDepartment() {
        return department;
    }

    public int getDayOff() {
        return dayOff;
    }

    public Staff (String id, String name, int age, double salaryFactor, String dayStartWork, int dayOff, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryFactor = salaryFactor;
        this.dayStartWork = dayStartWork;
        this.dayOff = dayOff;
        this.department = department;
    }
}
