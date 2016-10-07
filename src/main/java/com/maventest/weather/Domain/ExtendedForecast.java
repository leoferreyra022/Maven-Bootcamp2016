package com.maventest.weather.Domain;
import java.sql.Date;

/**
 * Created by Leo on 03/10/2016.
 */
public class ExtendedForecast
{
    private CurrentDay day;

    private ExtendedForecast(CurrentDay day) {
        this.day = day;
    }

    public ExtendedForecast() {
    }

    public CurrentDay getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "ExtendedForecast{" +
                "day=" + day +
                '}';
    }

    public static class ExtendedForecastBuilder {
        private CurrentDay.CurrentDayBuilder defaultDay;
        private CurrentDay day;

        public ExtendedForecastBuilder withDay(CurrentDay day) {
            this.day = day;
            return this;
        }

        public ExtendedForecast createExtendedForecast() {
            return new ExtendedForecast(day);
        }

        public ExtendedForecast createDefaultExtendedForecast() {
            return new ExtendedForecast(defaultDay.createDefaultCurrentDay());
        }
    }
}
