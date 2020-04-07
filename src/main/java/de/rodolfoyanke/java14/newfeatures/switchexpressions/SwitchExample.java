package de.rodolfoyanke.java14.newfeatures.switchexpressions;

public class SwitchExample {
    public static void main(String[] args) {
        var weekDay = getWeekDay();
        //java 11
        switch (weekDay) {
            case FRIDAY:
            case SATURDAY:
            case SUNDAY: System.out.println("Destroy liver and lungs");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY: System.out.println("Code and take Pantoprazol 40mg");
                break;
            default: System.out.println("My manager might introduce another weekday to make me work more");
        }

        //java 14
        switch (weekDay) {
            case FRIDAY, SATURDAY, SUNDAY -> System.out.println("Destroy liver and lungs");
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("Code and take Pantoprazol 40mg");
            default -> System.out.println("My manager might introduce another weekday to make me work more");
        }
    }

    private static WeekDay getWeekDay() {
        return WeekDay.SATURDAY;
    }
}