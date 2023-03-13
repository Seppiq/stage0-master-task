package com.epam.conditions;


public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 2 -> {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }
            case 4, 6, 9, 11 -> daysInMonth = 30;
            default -> daysInMonth = 31;
        }

        System.out.println(daysInMonth);
    }
}
