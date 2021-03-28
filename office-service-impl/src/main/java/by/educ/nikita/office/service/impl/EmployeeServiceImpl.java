package by.educ.nikita.office.service.impl;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.service.EmployeeService;

import java.util.Collection;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return employeeDAO.selectEmployees();
    }
}
