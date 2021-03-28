package by.educ.nikita.office.factory;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Properties;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.EmployeeMySQLDAO;
import by.educ.nikita.office.dao.TrainingDAO;
import by.educ.nikita.office.dao.TrainingMySQLDAO;
import by.educ.nikita.office.util.PropertiesUtil;
import org.apache.commons.dbcp.BasicDataSource;

public class MySQLDAOFactory extends DAOFactory {

    //Constants

    private static final String MYSQL_CONFIG_PROPERTIES = "mysql.properties";
    private static final String DRIVER_CLASS_NAME = "driverClassName";
    private static final String CONNECTION_URL = "connectionUrl";
    private static final String USER = "user";
    private static final String PASSWORD = "password";
    private static BasicDataSource mDatasource;

    //Members

    //Properties

    /**
     * MySQL DAO Factory constructor
     */
    public MySQLDAOFactory() {
        Properties mySQLproperties = new PropertiesUtil()
                .getProperties(MYSQL_CONFIG_PROPERTIES);
        mDatasource = new BasicDataSource();
        mDatasource.setDriverClassName(
                mySQLproperties.getProperty(DRIVER_CLASS_NAME));
        mDatasource.setUrl(mySQLproperties.getProperty(CONNECTION_URL));
        mDatasource.setUsername(mySQLproperties.getProperty(USER));
        mDatasource.setPassword(mySQLproperties.getProperty(PASSWORD));

//        try {
//            Class.forName(mySQLproperties.getProperty(DRIVER_CLASS_NAME));
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    //Methods


    public static Connection getConnection() throws SQLException {
        return mDatasource.getConnection();
    }

    /**
     * Returns factory instance
     */
//	public static synchronized DAOFactory getInstance() {
//		if (daoFactory == null) {
//			daoFactory = new MySQLDAOFactory();
//		}
//		return daoFactory;
//	}
    public EmployeeDAO getEmployeeDAO() {
        return new EmployeeMySQLDAO();
    }

    public TrainingDAO getTrainingDAO() {
        return new TrainingMySQLDAO();
    }

}
