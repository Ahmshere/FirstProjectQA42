package tests;

import org.example.Days;

public class DaysTest {

    public static void main(String[] args) {
                dayPicker(Days.SATURDAY);
    }
    public static void dayPicker(Days day){
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Рабочий день...");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Party time !!!");
                break;
            default:
                System.out.println("Something wrong...");



        }

    }
}
