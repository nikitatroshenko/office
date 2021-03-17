package by.educ.nikita.office.model;

import java.util.Objects;

public class Training {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Training)) return false;
        Training training = (Training) o;
        return id == training.id &&
                Objects.equals(name, training.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
