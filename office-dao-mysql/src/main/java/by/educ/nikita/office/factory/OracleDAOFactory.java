/**
 *
 */
package by.educ.nikita.office.factory;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;

public class OracleDAOFactory extends DAOFactory {

    private static OracleDAOFactory daoFactory = null;

    /* (non-Javadoc)
     * @see by.educ.nikita.office.factory.DAOFactory#getEmpoyeeDAO()
     */
    @Override
    public EmployeeDAO getEmpoyeeDAO() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see by.educ.nikita.office.factory.DAOFactory#getTrainingDAO()
     */
    @Override
    public TrainingDAO getTrainingDAO() {
        // TODO Auto-generated method stub
        return null;
    }

    private OracleDAOFactory() {

    }

    public static synchronized OracleDAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new OracleDAOFactory();
        }
        return daoFactory;
    }

}
