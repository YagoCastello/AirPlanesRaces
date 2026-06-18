package java10x.dev.AirPlanesRaces.RACES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplaneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<AirplaneModel, Long > {
}
