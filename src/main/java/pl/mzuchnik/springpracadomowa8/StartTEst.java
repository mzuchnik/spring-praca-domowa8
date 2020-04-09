package pl.mzuchnik.springpracadomowa8;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;
import pl.mzuchnik.springpracadomowa8.entity.WeatherEntity;
import pl.mzuchnik.springpracadomowa8.repository.WeatherRepo;
import pl.mzuchnik.springpracadomowa8.service.WeatherService;

@Component
public class StartTEst {

    private WeatherService weatherService;

    private WeatherRepo weatherRepo;

    public StartTEst(WeatherService weatherService, WeatherRepo weatherRepo) {
        this.weatherService = weatherService;
        this.weatherRepo = weatherRepo;
    }

    @Schedules({@Scheduled(cron = "0 0 * * * *")})
    public void showWeather(){
        WeatherEntity weather = weatherService.getWeather("523920");
        System.out.println(weather);
        weatherRepo.save(weather);

    }

}
