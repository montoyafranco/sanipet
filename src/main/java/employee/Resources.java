package employee;

import Medicines.*;

import java.util.ArrayList;
import java.util.List;


public final class Resources {
    private static List<Medicine> medicines = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();
    
    public static void setDefaults() {
        defaultStaff();
        defaultMedicines();
    }
    
    private static void defaultStaff() {
        employees.clear();
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
        medicines.clear();
        Medicine medicine1 = new Medicine("Ibuprofen", Presentation.SYRUP, "human", "64ml",25);
        Medicine medicine2 = new Medicine("Soloxiner", Presentation.PILLS, "veterinarian", "25g",10);
        Medicine medicine3 = new Medicine("Antiworms", Presentation.SYRUP, "human", "25g",15);
        Medicine medicine4 = new Medicine("Heartgard", Presentation.PET_CARE, "veterinarian", "100g",42);
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);
        medicines.add(medicine4);
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static List<Medicine> getMedicines() {
        return medicines;
    }
}
