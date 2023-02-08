package ibf2022.ssf.day13_lecture.repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import ibf2022.ssf.day13_lecture.model.*;

@Repository
public class EmployeeRepo {

    private List<Employee> employees;

    public void addEmployee() throws ParseException { 
        if (employees == null) {
            employees = new ArrayList<Employee>();  
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date dt = df.parse("1980-10-15");
        Employee emp = new Employee("Derrick", "Tan", "derricktan@gmail.com", "91234567", 7500,
        dt, "10 Ghim Moh", 272210);
        employees.add(emp);

        dt = df.parse("1980-10-15");
        emp = new Employee("Derrick", "Tan", "derricktan@gmail.com", "91234567", 7500,
        dt, "10 Ghim Moh", 272210);
        employees.add(emp);
    }
       
    public List<Employee> findAll() {

        return employees;
    }

    public Boolean save(Employee employee) {
        Boolean result = employees.add(employee);
        return result;
    }
    
    public Boolean delete(Employee employee) {
        // employees.stream().filter(emp -> emp.getEmail().equalsIgnoreCase(employee.getEmail())).findFirst().get();
        Boolean result = false;
        int employeeIndex = employees.indexOf(employee);

        if (employeeIndex >=0) {
            employees.remove(employeeIndex);
            result = true;
        }

        return result;

    }
}
