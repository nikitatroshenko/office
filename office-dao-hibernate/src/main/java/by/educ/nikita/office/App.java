package by.educ.nikita.office;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.hibernate.HibernateDaoFactory;
import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.model.Training;

import javax.persistence.Persistence;
import java.util.Collection;

public class App {

    public static void main(String[] args) {
        HibernateDaoFactory hibernateDaoFactory = new HibernateDaoFactory(Persistence.createEntityManagerFactory("nc_be_office"));
        EmployeeDAO employeeDAO = hibernateDaoFactory.getEmployeeDAO();
        Collection<Employee> employees = employeeDAO.selectEmployees();
        System.out.printf("\tId\tFirst Name\tLast Name\tEmail%n");
        for (Employee employee : employees) {
            System.out.print(printEmployee(employee));
        }
    }

    private static String printEmployee(Employee employee) {
        return String.format("\t%d\t%s\t%s\t%s%n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail())
                + printTrainings(employee);
    }

    private static String printTrainings(Employee employee) {
        StringBuilder sb = new StringBuilder();
        for (Training training : employee.getTrainings()) {
            sb.append("\t\t").append(training.getName()).append('\n');
        }
        return sb.toString();
    }
}
