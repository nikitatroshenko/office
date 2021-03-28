package by.educ.nikita.office.service.factory;

import by.educ.nikita.office.dao.hibernate.DaoFactory;
import by.educ.nikita.office.dao.hibernate.HibernateDaoFactory;
import by.educ.nikita.office.service.EmployeeService;
import by.educ.nikita.office.service.impl.EmployeeServiceImpl;

import javax.persistence.Persistence;

public class ServiceFactoryImpl {

    private DaoFactory daoFactory;

    public ServiceFactoryImpl() {
        daoFactory = new HibernateDaoFactory(Persistence.createEntityManagerFactory("nc_be_office"));
    }

    public EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl(daoFactory.getEmployeeDAO());
    }
}
