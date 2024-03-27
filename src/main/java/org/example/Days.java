package org.example;

public enum Days {
    MONDAY("Mon"),    TUESDAY("Tue"),
    WEDNESDAY("Wed"),    THURSDAY("Thu"),
    FRIDAY("Fri"),    SATURDAY("Sat"),
    SUNDAY("Sun");

    private final String abbreviation;

    Days(String abbreviation){
        this.abbreviation=abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }

}
