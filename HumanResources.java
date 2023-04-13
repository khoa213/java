import java.util.*;
public class HumanResources {
       static int count = 0;
        static int count1 = 0;
        static int count2 = 0;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        repeat();
        int choose = sc.nextInt();
        ArrayList <Employee> tableE = new ArrayList<Employee>();
        ArrayList <Manager> tableM = new ArrayList<Manager>();
        Employee e1 = new Employee("E001","Phong Tuyết Hoa",28,3.2,"10/10/2010",10,"Hành chính nhân sự",4);
        Employee e2 = new Employee("E002","Trần Thị Bình",24,2.2,"09/10/2019",7,"Hành chính nhân sự",3);
        tableE.add(e1);
        tableE.add(e2);
        Manager m1 = new Manager("M001","Nguyễn Văn An",25,2.5,"11/11/2010",5,"Công nghệ thông tin","Business Leader");
        Manager m2 = new Manager("M002","Tạ Văn Lục",32,4.5,"01/11/2010",1,"Công nghệ thông tin","Technical Leader");
        tableM.add(m1);
        tableM.add(m2);
        while (choose!=0) {
            if (choose==1) {
                head();

                Iterator itr = tableE.iterator();

                while (itr.hasNext()) {
                    Employee e = (Employee) itr.next();
                    e.displayInformation();

                }

                Iterator itrM = tableM.iterator();
                while (itrM.hasNext()) {
                    Manager m =(Manager) itrM.next();
                    m.displayInformation();

                }
                repeat();
                 choose = sc.nextInt();
            } else if (choose==2) {
                System.out.println("Mã bộ phận       | Tên bộ phận                 | Số lượng nhân viên");

                Iterator itr = tableE.iterator();
                Iterator itrM = tableM.iterator();
                while (itr.hasNext()|| itrM.hasNext()) {
                    Employee e = (Employee) itr.next();
                    Manager m =(Manager) itrM.next();
                    if (e.getDepartment()=="Hành chính nhân sự"||m.getDepartment()=="Hành chính nhân sự") {
                        count++;
                    }
                     if (e.getDepartment()=="Công nghệ thông tin"||m.getDepartment()=="Công nghệ thông tin") {
                        count1++;
                    }
                     if (e.getDepartment()=="Marketing"||m.getDepartment()=="Marketing") {
                        count2++;
                    }
                }

                Department d1 = new Department("HC","Hành chính nhân sự");
                d1.toString1();
                Department d2 = new Department("IT","Công nghệ thông tin");
                d2.toString2();
                Department d3 = new Department("MKT","Marketing");
                d3.toString3();
                repeat();
                choose = sc.nextInt();
            } else if (choose==3) {
                System.out.println("Hành chính nhân sự");
                head();
                Iterator itr = tableE.iterator();
                Iterator itrM = tableM.iterator();

                while (itr.hasNext()|| itrM.hasNext()) {
                    Employee e = (Employee) itr.next();
                    Manager m =(Manager) itrM.next();
                    if (e.getDepartment()=="Hành chính nhân sự") {
                        e.displayInformation();

                    }
                    if (m.getDepartment()=="Hành chính nhân sự") {
                        m.displayInformation();
                    }
                }
                System.out.println("Công nghệ thông tin");
                head();
                Iterator itr1 = tableE.iterator();
                Iterator itrM1 = tableM.iterator();
                while (itr1.hasNext()|| itrM1.hasNext()) {
                    Employee ee1 = (Employee) itr1.next();
                    Manager mm1 =(Manager) itrM1.next();
                    if (ee1.getDepartment()=="Công nghệ thông tin") {
                        ee1.displayInformation();

                    }
                    if (mm1.getDepartment()=="Công nghệ thông tin") {
                        mm1.displayInformation();
                    }
                }
                System.out.println("Marketing");
                head();
                Iterator itr2 = tableE.iterator();
                Iterator itrM2 = tableM.iterator();
                while (itr2.hasNext()|| itrM2.hasNext()) {
                    Employee ee2 = (Employee) itr2.next();
                    Manager mm2 =(Manager) itrM2.next();
                    if (ee2.getDepartment()=="Marketing") {
                        ee2.displayInformation();

                    }
                    if (mm2.getDepartment()=="Marketing") {
                        mm2.displayInformation();
                    }
                }
                repeat();
                choose = sc.nextInt();
            } else if (choose==4) {
                System.out.println("1. Thêm nhân viên thông thường");
                System.out.println("2. Thêm nhân viên cấp quản lý (có thêm chức vụ)");
                System.out.print("Bạn chọn: ");
                int add = sc.nextInt();
                if (add==1) {

                    System.out.print("Nhập mã nv: ");
                    String addID = sc.next();
                    sc.nextLine();
                    System.out.print("Nhập tên nv: ");
                    String addName = sc.nextLine();
                    System.out.print("Nhập tuổi nv: ");
                    int addAge = sc.nextInt();
                    System.out.print("Nhập hệ số lương: ");
                    double addFactor = sc.nextDouble();
                    System.out.print("Nhập ngày vào làm: ");
                    String addDay = sc.next();
                    System.out.print("Nhập số ngày nghỉ: ");
                    int addDayOff = sc.nextInt();
                    System.out.print("Nhập số giờ làm thêm: ");
                    double addTimeWorkMore = sc.nextDouble();
                    System.out.println("1. HC - Hành chính nhân sự");
                    System.out.println("2. IT - Công nghệ thông tin");
                    System.out.println("3. MKT - Marketing");
                    System.out.print("Bạn chọn bộ phận: ");
                    int addDep = sc.nextInt();
                    String dep = "";
                    head();
                    if (addDep==1) {
                         dep = "Hành chính nhân sự";
                    } else if (addDep==2) {
                         dep = "Công nghệ thông tin";
                    } else if (addDep==3) {
                         dep = "Marketing";
                    }
                    Employee e3 = new Employee(addID,addName,addAge,addFactor,addDay,addDayOff,dep,addTimeWorkMore);
                    tableE.add(e3);
                    Iterator itr = tableE.iterator();

                    while (itr.hasNext()) {
                        Employee e = (Employee) itr.next();
                        e.displayInformation();
                    }
                } else if (add==2) {
                    System.out.print("Nhập mã nv: ");
                    String addID = sc.next();
                    sc.nextLine();
                    System.out.print("Nhập tên nv: ");
                    String addName = sc.nextLine();
                    System.out.print("Nhập tuổi nv: ");
                    int addAge = sc.nextInt();
                    System.out.print("Nhập hệ số lương: ");
                    double addFactor = sc.nextDouble();
                    System.out.print("Nhập ngày vào làm: ");
                    String addDay = sc.next();
                    System.out.print("Nhập số ngày nghỉ: ");
                    int addDayOff = sc.nextInt();
                    System.out.println("1. HC - Hành chính nhân sự");
                    System.out.println("2. IT - Công nghệ thông tin");
                    System.out.println("3. MKT - Marketing");
                    System.out.print("Bạn chọn bộ phận: ");
                    int addDep = sc.nextInt();
                    String dep = "";
                    if (addDep==1) {
                        dep = "Hành chính nhân sự";
                    } else if (addDep==2) {
                        dep = "Công nghệ thông tin";
                    } else if (addDep==3) {
                        dep = "Marketing";
                    }
                    System.out.println("Chức danh:");
                    System.out.println("1. Business Leader");
                    System.out.println("2. Project Leader");
                    System.out.println("3. Technical Leader");
                    System.out.print("Nhập chức danh: ");
                    int addPosition = sc.nextInt();
                    String pos = "";
                    head();
                    if (addPosition==1) {
                        pos = "Business Leader";
                    } else if (addDep==2) {
                        pos = "Project Leader";
                    } else if (addDep==3) {
                        pos = "Technical Leader";
                    }
                    Manager m3 = new Manager(addID,addName,addAge,addFactor,addDay,addDayOff,dep,pos);
                    tableM.add(m3);
                    Iterator itrM = tableM.iterator();
                    while (itrM.hasNext()) {
                        Manager m = (Manager) itrM.next();
                        m.displayInformation();
                    }
                }
                repeat();
                choose = sc.nextInt();
            } else if (choose==5) {
                System.out.println("1. Tìm nhân viên bằng tên: ");
                System.out.println("2. Tìm nhân viên bằng mã nv: ");
                System.out.print("Bạn chọn: ");
                int search = sc.nextInt();
                sc.nextLine();
                if (search==1) {
                    System.out.print("Nhập tên: ");
                    String searchName = sc.nextLine();
                    head();
                    ArrayList <String> searchNameE = new ArrayList<String>();
                    ArrayList <String> searchNameM = new ArrayList<String>();
                    Iterator itr = tableE.iterator();

                    while (itr.hasNext()) {
                        Employee e = (Employee) itr.next();
                        searchNameE.add(e.getName());
                    }
                    Iterator itrM = tableM.iterator();
                    while (itrM.hasNext()) {
                        Manager m = (Manager) itrM.next();
                        searchNameM.add(m.getName()) ;
                    }
                    for (int i=0;i<searchNameE.size();i++) {
                        if ((searchNameE.get(i)).contains(searchName)) {
                            tableE.get(i).displayInformation();
                        }
                    }
                    for (int i=0;i<searchNameM.size();i++) {
                        if ((searchNameM.get(i)).contains(searchName)) {
                            tableM.get(i).displayInformation();
                        }
                    }
                } else if (search==2) {
                    System.out.print("Nhập mã nv: ");
                    String searchID = sc.next();
                    head();
                    ArrayList<String> searchIDE = new ArrayList<String>();
                    ArrayList<String> searchIDM = new ArrayList<String>();
                    Iterator itr = tableE.iterator();

                    while (itr.hasNext()) {
                        Employee e = (Employee) itr.next();
                        searchIDE.add(e.getId());
                    }
                    Iterator itrM = tableM.iterator();
                    while (itrM.hasNext()) {
                        Manager m = (Manager) itrM.next();
                        searchIDM.add(m.getId()) ;
                    }
                    for (int i=0;i<searchIDE.size();i++) {
                        if ((searchIDE.get(i)).contains(searchID)) {
                            tableE.get(i).displayInformation();
                        }
                    }
                    for (int i=0;i<searchIDM.size();i++) {
                        if ((searchIDM.get(i)).contains(searchID)) {
                            tableM.get(i).displayInformation();
                        }
                    }
                }

                repeat();
                choose = sc.nextInt();
            }
        }


    }
    public static void repeat() {
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
        System.out.println("2. Hiển thị các bộ phận trong công ty");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
        System.out.println("4. Thêm nhân viên mời vào công ty");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
        System.out.println("6. Hiển thị bảng lương nhân viên toàn công ty");
        System.out.println("0. Thoát chương trình");
        System.out.print("Lựa chọn của bạn: ");

    }
    public static void head() {
        System.out.println("Mã nhân viên    | Tên nhân viên            | Tuổi            | HS Lương          | Ngày vào làm           | Ngày nghỉ phép        " +
                "| Bộ phận                      " +"| Số giờ làm thêm / chức vụ          | Lương ");
    }
}
