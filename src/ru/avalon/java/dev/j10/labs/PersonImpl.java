package ru.avalon.java.dev.j10.labs;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class PersonImpl implements Person{
    
    private String name;
    Date birthDate = new Date();

    public PersonImpl(){}
    
    public PersonImpl(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        return toStringFormateDate().compareTo(((PersonImpl)o).toStringFormateDate());
    }

    @Override
    public String toString() {
        return "PersonImpl{ " + name + ", " + birthDate.toLocaleString() + " }";
    }
    
    public String toStringFormateDate() {
        return name + ", " + (birthDate.getYear()+1900) + "." + (birthDate.getMonth()+1) + "." + birthDate.getDate();
    }
    
    
}
