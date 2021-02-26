package by.educ.nikita.office.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.factory.MySQLDAOFactory;

public class EmployeeMySQLDAO implements EmployeeDAO {

    private static final String SQL = "select id, first_name, last_name, email from employee";
    // logger for the class
    static Logger logger = LogManager.getLogger(EmployeeMySQLDAO.class);

    public EmployeeMySQLDAO() {

    }

    /*
     * (non-Javadoc)
     *
     * @see by.educ.nikita.office.dao.EmployeeDAO#deleteEmployee(java.lang.String)
     */
    public boolean deleteEmployee(String pEmployee) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see by.educ.nikita.office.dao.EmployeeDAO#findEmployee(java.lang.String)
     */
    public Employee findEmployee(String pEmployeeId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * by.educ.nikita.office.dao.EmployeeDAO#insertEmployee(by.educ.nikita.office.bean
     * .Employee)
     */
    public int insertEmployee(Employee pEmployee) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see by.educ.nikita.office.dao.EmployeeDAO#selectEmployees()
     */
    public Collection<Employee> selectEmployees() {
        try {
            List<Employee> employees = new ArrayList<Employee>();
            Employee employeeBean;
            Connection connection = MySQLDAOFactory.getConnection();
            PreparedStatement ptmt = connection.prepareStatement(SQL);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                employeeBean = new Employee();
                employeeBean.setId(rs.getInt(1));
                employeeBean.setFirstName(rs.getString(2));
                employeeBean.setLastName(rs.getString(3));
                employeeBean.setEmail(rs.getString(4));
                employees.add(employeeBean);
                logger.debug("Employee.id:" + employeeBean.getId() +
                        " Employee.firsName:" + employeeBean.getFirstName() +
                        " Employee.lastName:" + employeeBean.getLastName() +
                        " Employee.email:" + employeeBean.getEmail());
            }
            return employees;
        } catch (SQLException ex) {
            logger.error(ex.getMessage());
            return Collections.emptyList();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see by.educ.nikita.office.dao.EmployeeDAO#updateEmployee(java.lang.String)
     */
    public boolean updateEmployee(String pEmployeeId) {
        // TODO Auto-generated method stub
        return false;
    }

}
