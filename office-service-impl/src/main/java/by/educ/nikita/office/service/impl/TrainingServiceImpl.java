package by.educ.nikita.office.service.impl;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;
import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.model.Training;
import by.educ.nikita.office.service.TrainingService;

public class TrainingServiceImpl implements TrainingService {

    private TrainingDAO trainingDao;
    private EmployeeDAO employeeDao;

    public void registerEmployeeToTraining(String trainingId, String employeeId) {
        Training training = trainingDao.findTraining(trainingId);
        Employee employee = employeeDao.findEmployee(employeeId);
        employee.getTrainings().add(training);
        employeeDao.updateEmployee(employee);
    }

    public void setTrainingDao(TrainingDAO trainingDao) {
        this.trainingDao = trainingDao;
    }

    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }
}
