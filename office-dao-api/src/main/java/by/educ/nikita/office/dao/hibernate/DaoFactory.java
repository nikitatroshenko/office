package by.educ.nikita.office.dao.hibernate;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;

public interface DaoFactory {
    TrainingDAO getTrainingDAO();

    EmployeeDAO getEmployeeDAO();
}
