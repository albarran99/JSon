package org.iesfm.json;

import java.util.Objects;

public class Employess {
    private int nif;
    private String name;
    private String surname;
    private String position;

    public Employess() {
    }

    public Employess(int nif, String name, String surname, String position) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employess employess = (Employess) o;
        return nif == employess.nif && Objects.equals(name, employess.name) && Objects.equals(surname, employess.surname) && Objects.equals(position, employess.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, position);
    }

    @Override
    public String toString() {
        return "Employess{" +
                "nif=" + nif +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
