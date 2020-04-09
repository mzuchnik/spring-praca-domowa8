package pl.mzuchnik.springpracadomowa8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mzuchnik.springpracadomowa8.entity.WeatherEntity;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherEntity,Long> {
}
