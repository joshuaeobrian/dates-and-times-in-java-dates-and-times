package com.theironyard;

import net.doughughes.testifier.exception.*;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class SignificantDateTest extends TestifierTest{

    @Test
    public void testNewYearsDayProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "NEW_YEARS_DAY");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("NEW_YEARS_DAY month should be January",
                date.getMonth(), equalTo(Month.JANUARY));
        assertThat("NEW_YEARS_DAY day should be 1",
                date.getDayOfMonth(), equalTo(1));
    }

    @Test
    public void testNewYearsDayPropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("NEW_YEARS_DAY");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("NEW_YEARS_DAY property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("NEW_YEARS_DAY property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("NEW_YEARS_DAY property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));

    }

    @Test
    public void testValentinesDayProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "VALENTINES_DAY");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("VALENTINES_DAY month should be February",
                date.getMonth(), equalTo(Month.FEBRUARY));
        assertThat("VALENTINES_DAY day should be 14",
                date.getDayOfMonth(), equalTo(14));
    }

    @Test
    public void testValentinesDayPropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("VALENTINES_DAY");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("VALENTINES_DAY property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("VALENTINES_DAY property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("VALENTINES_DAY property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));
    }

    @Test
    public void testLeapYearProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "LEAP_YEAR");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("LEAP_YEAR month should be February",
                date.getMonth(), equalTo(Month.FEBRUARY));
        assertThat("LEAP_YEAR day should be 29",
                date.getDayOfMonth(), equalTo(29));
    }

    @Test
    public void testLeapYearPropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("LEAP_YEAR");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("LEAP_YEAR property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("LEAP_YEAR property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("LEAP_YEAR property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));
    }

    @Test
    public void testFourthOfJulyProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "FOURTH_OF_JULY");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("FOURTH_OF_JULY month should be July",
                date.getMonth(), equalTo(Month.JULY));
        assertThat("FOURTH_OF_JULY day should be 4",
                date.getDayOfMonth(), equalTo(4));
    }

    @Test
    public void testFourthOfJulyPropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("FOURTH_OF_JULY");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("FOURTH_OF_JULY property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("FOURTH_OF_JULY property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("FOURTH_OF_JULY property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));
    }

    @Test
    public void testChristmasProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "CHRISTMAS");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("CHRISTMAS month should be December",
                date.getMonth(), equalTo(Month.DECEMBER));
        assertThat("CHRISTMAS day should be 25",
                date.getDayOfMonth(), equalTo(25));
    }

    @Test
    public void testChristmasPropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("CHRISTMAS");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("CHRISTMAS property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("CHRISTMAS property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("CHRISTMAS property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));
    }

    @Test
    public void testNewYearsEveProperty() {
        /* arrange */

        /* act */
        MonthDay date = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "NEW_YEARS_EVE");
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("NEW_YEARS_EVE month should be December",
                date.getMonth(), equalTo(Month.DECEMBER));
        assertThat("NEW_YEARS_EVE day should be 31",
                date.getDayOfMonth(), equalTo(31));
    }

    @Test
    public void testNewYearsEvePropertyExerciseRequirements(){
        /* arrange */

        /* act */
        String source = "";
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfProperty("NEW_YEARS_EVE");
        } catch (CannotFindFieldException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("NEW_YEARS_EVE property should be MonthDay",
                source, RegexMatcher.matches("^.*?ClassOrInterfaceType\\[MonthDay\\].*?$"));
        assertThat("NEW_YEARS_EVE property should be static and final",
                source, RegexMatcher.matches("^.*?StaticModifier FinalModifier.*?$"));
        assertThat("NEW_YEARS_EVE property should use the Month enum when creating the MonthDay object.",
                source, RegexMatcher.matches("^.*?MethodArguments.*?NameExpr\\[Month\\].*?FieldAccessExpr.*?/MethodArguments.*?$"));
    }

    @Test
    public void testNextOccurrenceOfNewYearsDayIsInFuture(){
        /* arrange */

        /* act */
        MonthDay date = null;
        LocalDate next = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "NEW_YEARS_DAY");
            next = (LocalDate) Invoker.invokeStatic(SignificantDate.class, "next", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The next occurrence of New Years Day should be after today.",
                next, greaterThan(LocalDate.now()));
    }

    @Test
    public void testDaysToNextOccurrenceOfNewYearsDay(){
        /* arrange */

        /* act */
        MonthDay date = null;
        long days = 0;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "NEW_YEARS_DAY");
            days = (long) Invoker.invokeStatic(SignificantDate.class, "daysTo", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("There should be at least one day until the next occurrence of new years day",
                days, greaterThan(0L));
    }

    @Test
    public void testNextOccurrenceOfValentinesDayIsInFuture(){
        /* arrange */

        /* act */
        MonthDay date = null;
        LocalDate next = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "VALENTINES_DAY");
            next = (LocalDate) Invoker.invokeStatic(SignificantDate.class, "next", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The next occurrence of Valentines Day should be after today.",
                next, greaterThan(LocalDate.now()));
    }

    @Test
    public void testDaysToNextOccurrenceOfValentinesDay(){
        /* arrange */

        /* act */
        MonthDay date = null;
        long days = 0;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "VALENTINES_DAY");
            days = (long) Invoker.invokeStatic(SignificantDate.class, "daysTo", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */

        /* assert */
        assertThat("There should be at least one day until the next occurrence of valentines day",
                days, greaterThan(0L));
    }

    @Test
    public void testNextOccurrenceOfLeapYearIsInFuture(){
        /* arrange */

        /* act */
        MonthDay date = null;
        LocalDate next = null;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "LEAP_YEAR");
            next = (LocalDate) Invoker.invokeStatic(SignificantDate.class, "next", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The next occurrence of leap year should be after today.",
                next, greaterThan(LocalDate.now()));
    }

    @Test
    public void testDaysToNextOccurrenceOfLeapYear(){
        /* arrange */

        /* act */
        MonthDay date = null;
        long days = 0;
        try {
            date = (MonthDay) Invoker.readProperty(new SignificantDate(), "LEAP_YEAR");
            days = (long) Invoker.invokeStatic(SignificantDate.class, "daysTo", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("There should be at least one day until the next occurrence of leap year",
                days, greaterThan(0L));
    }

    @Test
    public void testNextOccurrenceOfArbitraryDateIsInFuture(){
        /* arrange */

        /* act */
        MonthDay date = MonthDay.of(Month.DECEMBER, 9);
        LocalDate next = null;
        try {
            next = (LocalDate) Invoker.invokeStatic(SignificantDate.class, "next", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The next occurrence of December 9 should be after today.",
                next, greaterThan(LocalDate.now()));
    }

    @Test
    public void testDaysToNextOccurrenceOfArbitraryDate(){
        /* arrange */

        /* act */
        MonthDay date = MonthDay.of(Month.DECEMBER, 9);
        long days = 0;
        try {
            days = (long) Invoker.invokeStatic(SignificantDate.class, "daysTo", date);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("There should be at least one day until the next occurrence of 12/9",
                days, greaterThan(0L));
    }

    @Test
    public void testNextOccurrenceOfTomorrowShouldBeTomorrow(){
        /* arrange */

        /* act */

        MonthDay tomorrow = MonthDay.from(LocalDate.now().plus(1, ChronoUnit.DAYS));
        LocalDate next = null;
        try {
            next = (LocalDate) Invoker.invokeStatic(SignificantDate.class, "next", tomorrow);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The next tomorrow should occur tomorrow.",
                tomorrow, equalTo(tomorrow));
    }

    @Test
    public void testDaysToNextOccurrenceOfTomorrow(){
        /* arrange */

        /* act */
        MonthDay tomorrow = MonthDay.from(LocalDate.now().plus(1, ChronoUnit.DAYS));
        long days = 0;
        try {
            days = (long) Invoker.invokeStatic(SignificantDate.class, "daysTo", tomorrow);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("There should be 1 day until tomorrow",
                days, equalTo(1L));
    }

}