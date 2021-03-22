package by.educ.nikita.office.dao.hibernate;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Collection;

public class EmployeeHibernateDao implements EmployeeDAO {

    private final EntityManagerFactory entityManagerFactory;

    public EmployeeHibernateDao(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    @Override
    public int insertEmployee(Employee pEmployee) {
        return 0;
    }

    @Override
    public boolean deleteEmployee(String pEmployee) {
        return false;
    }

    @Override
    public Employee findEmployee(String pEmployeeId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(Employee.class, Integer.valueOf(pEmployeeId));
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public Collection<Employee> selectEmployees() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager
                    .createQuery("select e from Employee e")
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }
}
