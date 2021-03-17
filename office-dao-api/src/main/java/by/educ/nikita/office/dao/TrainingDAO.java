package by.educ.nikita.office.dao;

import java.util.Collection;

import by.educ.nikita.office.model.Training;

public interface TrainingDAO {

    int insertTraining(Training pTraining);

    boolean deleteTraining(String pTraining);

    Training findTraining(String pTrainingId);

    boolean updateTraining(String pTrainingId);

    Collection<Training> selectTrainings();
}
