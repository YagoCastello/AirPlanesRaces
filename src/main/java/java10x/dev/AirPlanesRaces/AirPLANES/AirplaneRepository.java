package java10x.dev.AirPlanesRaces.AirPLANES;

import java10x.dev.AirPlanesRaces.RACES.RaceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<RaceModel, Long > {

}
