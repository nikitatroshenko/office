package by.educ.nikita.office.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<Training> trainings = new HashSet<Training>();

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        email = pEmail;
    }

    public Set<Training> getTrainings() {
        if (trainings == null) {
            trainings = new HashSet<>();
        }
        return trainings;
    }

    public void setTrainings(Set<Training> pTrainings) {
        trainings = pTrainings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(trainings, employee.trainings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, trainings);
    }
}
