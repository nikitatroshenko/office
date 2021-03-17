package by.educ.nikita.office.service.impl;

import by.educ.nikita.office.dao.EmployeeDAO;
import by.educ.nikita.office.dao.TrainingDAO;
import by.educ.nikita.office.io.JsonEntityLoader;
import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.model.Training;
import by.educ.nikita.office.service.TrainingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TrainingServiceImplTest {

    private static final String TRAINING_PATH = "by.educ.nikita.office.trainings/java-backend.json";
    private static final String EMPLOYEE_PATH = "by.educ.nikita.office.trainings/employee-1.json";

    @Mock
    private EmployeeDAO employeeDao;

    @Mock
    private TrainingDAO trainingDao;

    @InjectMocks
    private TrainingService trainingService = new TrainingServiceImpl();

    private Training training;
    private Employee employee;

    @Before
    public void setUp() {
        training = JsonEntityLoader.loadEntity(TRAINING_PATH, Training.class);
        employee = JsonEntityLoader.loadEntity(EMPLOYEE_PATH, Employee.class);
        when(employeeDao.findEmployee(Matchers.<String>any())).thenReturn(employee);
        when(trainingDao.findTraining(any(String.class))).thenReturn(training);
    }

    @Test
    public void registerEmployeeToTraining() {
        trainingService.registerEmployeeToTraining(String.valueOf(training.getId()), String.valueOf(employee.getId()));
        Assert.assertTrue(employee.getTrainings().contains(training));
        verify(employeeDao, atLeastOnce()).findEmployee(Matchers.<String>any());
    }
}
