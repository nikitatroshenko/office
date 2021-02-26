package by.educ.nikita.office.factory;

import by.educ.nikita.office.dao.EmployeeDAO;

public class DAOFactoryTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DAOFactory mySQLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        EmployeeDAO employee = mySQLDAOFactory.getEmpoyeeDAO();
        System.out.println(employee.selectEmployees().size());
    }

}

