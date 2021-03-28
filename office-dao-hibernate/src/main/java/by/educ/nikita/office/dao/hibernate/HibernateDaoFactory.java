package by.educ.nikita.office.dao.hibernate;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;

import javax.persistence.EntityManagerFactory;

public class HibernateDaoFactory implements DaoFactory {

    private final EntityManagerFactory entityManagerFactory;

    public HibernateDaoFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public TrainingDAO getTrainingDAO() {
        return null;
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return new EmployeeHibernateDao(entityManagerFactory);
    }
}
