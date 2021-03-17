package by.educ.nikita.office.dao;

import by.educ.nikita.office.factory.DAOFactory;
import junit.framework.TestCase;

public class EmployeeDAOTest extends TestCase {

    private DAOFactory mMySQLDAOFactory;

    private EmployeeDAO mEmployee;

    public EmployeeDAOTest(String name) {
        super(name);
    }

    /**
     * @throws java.lang.Exception
     */
    protected void setUp() throws Exception {
        super.setUp();
//        mMySQLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
//        mEmployee = mMySQLDAOFactory.getEmpoyeeDAO();
    }

    /**
     * @throws java.lang.Exception
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test returns collection of employees
     */
    public void testSelectEmployees() {
//        assertEquals(12, mEmployee.selectEmployees().size());
    }
}
