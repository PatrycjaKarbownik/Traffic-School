package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Trainee {
    private StringProperty pesel;
    private StringProperty surname;
    private StringProperty name;
    private StringProperty birthday;
    private StringProperty city;
    private StringProperty street;
    private IntegerProperty building_no;
    private IntegerProperty flat_no;
    private StringProperty starting_date;
    private char theory;
    private char internal_exam;

    public Trainee() {
        this.pesel = new SimpleStringProperty();
        this.surname = new SimpleStringProperty();
        this.name = new SimpleStringProperty();
        this.birthday = new SimpleStringProperty();
        this.city = new SimpleStringProperty();
        this.street = new SimpleStringProperty();
        this.building_no = new SimpleIntegerProperty();
        this.flat_no = new SimpleIntegerProperty();
        this.starting_date = new SimpleStringProperty();
    }

    //pesel
    public String getPesel() {
        return pesel.get();
    }

    public void setPesel(String pesel) {
        this.pesel.set(pesel);
    }

    public StringProperty peselProperty() {
        return pesel;
    }

    //surname
    public String getSurname() {
        return surname.get();
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    //name
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    //birthday
    public String getBirthday() {
        return birthday.get();
    }

    public void setBirthday(String birthday) {
        this.birthday.set(birthday);
    }

    public StringProperty birthdayProperty() {
        return birthday;
    }

    //city
    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    //street
    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    //building_no
    public int getBuilding_no() {
        return building_no.get();
    }

    public void setBuilding_no(int building_no) {
        this.building_no.set(building_no);
    }

    public IntegerProperty building_noProperty() {
        return building_no;
    }

    //flat_no
    public int getFlat_no() {
        return flat_no.get();
    }

    public void setFlat_no(int flat_no) {
        this.flat_no.set(flat_no);
    }

    public IntegerProperty flat_noProperty() {
        return flat_no;
    }

    //starting_date
    public String getStarting_date() {
        return starting_date.get();
    }

    public void setStarting_date(String starting_date) {
        this.starting_date.set(starting_date);
    }

    public StringProperty starting_dateProperty() {
        return starting_date;
    }

    //theory
    public char getTheory() {
        return theory;
    }

    public void setTheory(char theory) {
        this.theory = theory;
    }

    //internal_exam
    public char getInternal_exam() {
        return internal_exam;
    }

    public void setInternal_exam(char internal_exam) {
        this.internal_exam = internal_exam;
    }
}
