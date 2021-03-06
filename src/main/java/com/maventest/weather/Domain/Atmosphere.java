package com.maventest.weather.Domain;

/**
 * Created by Leo on 03/10/2016.
 */
public class Atmosphere
{
    private int humidity;
    private Double pressure;
    private Double visibility;
    private Double rising;

    private Atmosphere(int humidity, Double pressure, Double visibility, Double rising) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.visibility = visibility;
        this.rising = rising;
    }

    public int getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public Double getRising() {
        return rising;
    }

    @Override
    public String toString() {
        return "Atmosphere{" +
                "humidity=" + humidity +
                ", pressure=" + pressure +
                ", visibility=" + visibility +
                ", rising=" + rising +
                '}';
    }

    public static class AtmosphereBuilder {
        private int humidity;
        private Double pressure;
        private Double visibility;
        private Double rising;

        public AtmosphereBuilder withHumidity(int humidity) {
            this.humidity = humidity;
            return this;
        }

        public AtmosphereBuilder withPressure(Double pressure) {
            this.pressure = pressure;
            return this;
        }

        public AtmosphereBuilder withVisibility(Double visibility) {
            this.visibility = visibility;
            return this;
        }

        public AtmosphereBuilder withRising(Double rising) {
            this.rising = rising;
            return this;
        }

        public Atmosphere createAtmosphere() {
            return new Atmosphere(humidity, pressure, visibility, rising);
        }

        public Atmosphere createDefaultAtmosphere() {
            return new Atmosphere(56, 12.9, 50.8, 12.3);
        }
    }
}
