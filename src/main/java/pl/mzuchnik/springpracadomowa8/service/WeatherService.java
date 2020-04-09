package pl.mzuchnik.springpracadomowa8.service;

import pl.mzuchnik.springpracadomowa8.entity.WeatherEntity;

public interface WeatherService {

    WeatherEntity getWeather(String woeid);
}
