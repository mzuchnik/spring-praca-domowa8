package pl.mzuchnik.springpracadomowa8.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "weathers")
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double temp;

    @Column(name = "air_pressure")
    private Double airPressure;

    @Column(name = "weather_state")
    private String weatherState;

    private LocalDate date;

    public WeatherEntity() {
    }

    public WeatherEntity(Double temp, Double airPressure, String weatherState, LocalDate date) {
        this.temp = temp;
        this.airPressure = airPressure;
        this.weatherState = weatherState;
        this.date = date;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "id=" + id +
                ", temp=" + temp +
                ", airPressure=" + airPressure +
                ", weatherState='" + weatherState + '\'' +
                ", date=" + date +
                '}';
    }
}
