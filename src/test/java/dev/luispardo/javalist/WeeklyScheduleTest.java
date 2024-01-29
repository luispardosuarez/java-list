package dev.luispardo.javalist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeeklyScheduleTest {

    private WeeklySchedule weeklySchedule;

    @BeforeEach
    public void setUp() {
        weeklySchedule = new WeeklySchedule();
    }

    @Test
    public void testGetWeekDays() {
        List<String> weekDays = weeklySchedule.getWeekDays();
        assertEquals(7, weekDays.size());
    }

    @Test
    public void testGetWeekDaysCount() {
        assertEquals(7, weeklySchedule.getWeekDaysCount());
    }

    @Test
    public void testRemoveWeekDay() {
        weeklySchedule.removeWeekDay("Lunes");
        assertEquals(6, weeklySchedule.getWeekDaysCount());
        assertFalse(weeklySchedule.containsWeekDay("Lunes"));
    }

    @Test
    public void testGetWeekDay() {
        assertEquals("Martes", weeklySchedule.getWeekDay(1));
    }

    @Test
    public void testContainsWeekDay() {
        assertTrue(weeklySchedule.containsWeekDay("Jueves"));
        assertFalse(weeklySchedule.containsWeekDay("Febrero"));
    }

    @Test
    public void testSortWeekDaysAlphabetically() {
        weeklySchedule.sortWeekDaysAlphabetically();
        List<String> sortedWeekDays = weeklySchedule.getWeekDays();
        assertThat(sortedWeekDays, contains("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"));
    }

    @Test
    public void testClearWeekDays() {
        weeklySchedule.clearWeekDays();
        assertEquals(0, weeklySchedule.getWeekDaysCount());
    }
}
