package dev.luispardo.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklySchedule {
    private List<String> weekDays;

    public WeeklySchedule() {
        this.weekDays = new ArrayList<>();
        initializeWeekDays();
    }

    public void initializeWeekDays() {
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miércoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sábado");
        weekDays.add("Domingo");
    }

    public List<String> getWeekDays() {
        return weekDays;
    }

    public int getWeekDaysCount() {
        return weekDays.size();
    }

    public void removeWeekDay(String day) {
        weekDays.remove(day);
    }

    public String getWeekDay(int index) {
        return weekDays.get(index);
    }

    public boolean containsWeekDay(String day) {
        return weekDays.contains(day);
    }

    public void sortWeekDaysAlphabetically() {
        Collections.sort(weekDays);
    }

    public void clearWeekDays() {
        weekDays.clear();
    }
}
