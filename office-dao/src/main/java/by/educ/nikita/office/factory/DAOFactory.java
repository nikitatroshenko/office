package by.educ.nikita.office.factory;


import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;

public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;

    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.
    public abstract EmployeeDAO getEmpoyeeDAO();

    public abstract TrainingDAO getTrainingDAO();

    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case MYSQL:
                return new MySQLDAOFactory();//MySQLDAOFactory.getInstance();
            case ORACLE:
                return null;//new OracleDAOFactory();//OracleDAOFactory.getInstance();
            default:
                return null;
        }
    }
}
