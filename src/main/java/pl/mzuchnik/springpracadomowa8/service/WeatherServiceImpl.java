package pl.mzuchnik.springpracadomowa8.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mzuchnik.springpracadomowa8.entity.WeatherEntity;
import pl.mzuchnik.springpracadomowa8.model.api.ConsolidatedWeather;
import pl.mzuchnik.springpracadomowa8.model.api.WeatherApiFullResponse;

import java.time.LocalDate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather-api-url}")
    private String apiUrl;

    @Override
    public WeatherEntity getWeather(String woeid) {

        RestTemplate restTemplate = new RestTemplate();

        WeatherApiFullResponse weatherApiFullResponse = restTemplate.getForObject(apiUrl + "/" + woeid, WeatherApiFullResponse.class);

        ConsolidatedWeather cw = weatherApiFullResponse.getConsolidatedWeather().get(0);

        return new WeatherEntity(cw.getTheTemp(),cw.getAirPressure(),cw.getWeatherStateName(), LocalDate.parse(cw.getApplicableDate()));
    }
}
