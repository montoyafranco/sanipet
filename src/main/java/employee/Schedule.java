package employee;

import Medicines.Medicine;

import java.util.ArrayList;
import java.util.List;


public class Schedule {
    private static List<Medicine> medicines = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();

    public Schedule() {
        defaultStaff();
    }

    private static void defaultStaff() {
        Employee doctor1 = new Employee("David", "Rueda", EmployeeType.DOCTOR);
        doctor1.setWorkDays("Monday", "Tuesday", "Wednesday");
        Employee doctor2 = new Employee("Agustin", "Montoya", EmployeeType.DOCTOR);        
        doctor2.setWorkDays("Monday", "Tuesday", "Wednesday");
        Employee doctor3 = new Employee("Karlo", "Martinez", EmployeeType.DOCTOR);
        doctor3.setWorkDays("Thursday", "Friday", "Saturday");
        Employee stylist1 = new Employee("Jhon", "Doe", EmployeeType.STYLIST);
        stylist1.setWorkDays("Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday");
        Employee stylist2 = new Employee("Tomas", "Keylor", EmployeeType.STYLIST);
        stylist2.setWorkDays("Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday");
        employees.add(doctor1);
        employees.add(doctor2);
        employees.add(doctor3);
        employees.add(stylist1);
        employees.add(stylist2);
    }

    private static void defaultMedicines() {
//         name, presentation,String usage,int quantity,int stock
        
    }

    public List<Employee> getEmployees() {
        return employees;
    }


}
