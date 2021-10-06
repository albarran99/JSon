package org.iesfm.json;

import java.util.List;
import java.util.Objects;

public class Department {

    private String name;
    private List<Employess> employess;

    public Department() {
    }

    public Department(String name, List<Employess> employess) {
        this.name = name;
        this.employess = employess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employess> getEmployess() {
        return employess;
    }

    public void setEmployess(List<Employess> employess) {
        this.employess = employess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(employess, that.employess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employess);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employess=" + employess +
                '}';
    }
}
