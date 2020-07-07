package OOPYouTube;

public class MainEmployee {
    public static void main(String[] args) {

        Employee employee= new Employee();
        employee.employeeMethod("Karl", 18);
        employee.setPositionPay();
        System.out.println(employee.infoEmployee(5));
        employee.mentor();

        Employee employee1 = new Employee("Jack", 1);
        employee1.setPositionPay();
        System.out.println(employee1.infoEmployee(0));
        employee1.mentor();

        Employee employee2 = new Employee();
        employee2.name = "Dolli";
        employee2.works = 6;
        employee2.setPositionPay();
        System.out.println(employee2.infoEmployee(1));
        employee2.mentor();
    }
}
