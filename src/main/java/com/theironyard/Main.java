package com.theironyard;

import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

/**
 * For this exercise you will be creating a new class, SignificantDate, that can
 * be used to calculate the days until a given date (such as Valentine's Day,
 * New Years, Leap Year, etc). You should open the SignificantDate class and
 * follow the instructions there.
 *
 * Once you've completed the SignificantDate follow the instructions below to
 * use the SignificantDate class.
 */
public class Main {

    public static void main(String[] args) {

        /*
            In this main() method you should make use of your SignificantDate
            class. Use the next() method to find and print the next instance of
            and number of days to three dates:

            - One of the holiday constants defined in SignificantDate (not Leap Year)
            - Leap Year
            - Any other arbitrary date

            Here is some valid example output:

            There are 354 days until the next occurrence of Christmas on 12/25/2017
            There are 1150 days until the next occurrence of Leap Year on 2/29/2020
            There are 338 days until the next occurrence of my birthday on 12/9/2017

            Be sure to use the DateTimeFormatter class to format the date
            correctly. The date is in the form of month/day/year, without any
            leading zeros on the month or day. For example, February is 2, not
            02.

            https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

            To create a DateTimeFormatter you must use the ofPattern() method to
            establish the pattern/format to create.

            https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ofPattern-java.lang.String-

            The syntax for defining patterns is documented here:

            https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns

            Once you have your DateTimeFormatter you can use the format() method
            to convert a LocalDate (or any other representation of time in the
            java.time package).

            https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#format-java.time.temporal.TemporalAccessor-

         */
        String format;
        // todo: create a new DateTimeFormatter in a variable named formatter
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("M/d/y");

            format = SignificantDate.next(SignificantDate.NEW_YEARS_DAY).format(formatter);
        // todo: print the number of days to and the date of the next occurrence of a constant date defined in SignificantDate (other than leap year). EG: Valentines Day

        //SignificantDate.next(SignificantDate.NEW_YEARS_DAY).format(formatter);
        System.out.printf("There are %s days until the next occurrence of New Years on %s%n",
                SignificantDate.daysTo(SignificantDate.NEW_YEARS_DAY),formatter.format(SignificantDate.next(SignificantDate.NEW_YEARS_DAY)));
        // todo: print the number of days to and date of the next occurrence of leap year

        System.out.printf("There are %s days until the next occurrence of Leap Year on %s%n",
                SignificantDate.daysTo(SignificantDate.LEAP_YEAR),formatter.format(SignificantDate.next(SignificantDate.LEAP_YEAR)));

        // todo: print the number of days to and date of any arbitrary MonthDate that is not defined as a constant in SignificantDate. EG: your birthday
        //System.out.printf(SignificantDate.next(MonthDay.of(Month.MARCH,7)).format(formatter));

        System.out.printf("There are %s days until the next occurrence of Your Birthday on %s%n",
                SignificantDate.daysTo(MonthDay.of(Month.MARCH,7)),formatter.format(SignificantDate.next(MonthDay.of(Month.MARCH,7))));
///////////
        //SignificantDate.next(SignificantDate.NEW_YEARS_DAY).format(formatter);
//        System.out.println("There are "+ SignificantDate.daysTo(SignificantDate.NEW_YEARS_DAY)+" days until the next occurrence of New Years on "+
//               format);
//
//        // todo: print the number of days to and date of the next occurrence of leap year
//
//        format =SignificantDate.next(SignificantDate.LEAP_YEAR).format(formatter);
//
//        System.out.println("There are "+ SignificantDate.daysTo(SignificantDate.LEAP_YEAR)+" days until the next occurrence of Leap Year on "+ format
//                );
//        // todo: print the number of days to and date of any arbitrary MonthDate that is not defined as a constant in SignificantDate. EG: your birthday
//
//        format = SignificantDate.next(MonthDay.of(Month.MARCH,7)).format(formatter);
//
//        System.out.println("There are "+ SignificantDate.daysTo(MonthDay.of(Month.MARCH,7))+" days until the next occurrence of Birthday on "+
//               format );
    }

}
