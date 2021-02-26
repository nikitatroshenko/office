package by.educ.nikita.office.dao;

import java.util.Collection;

import by.educ.nikita.office.model.Employee;


public interface EmployeeDAO {

    int insertEmployee(Employee pEmployee);

    boolean deleteEmployee(String pEmployee);

    Employee findEmployee(String pEmployeeId);

    boolean updateEmployee(String pEmployeeId);

    Collection<Employee> selectEmployees();
}
