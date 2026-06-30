package java10x.dev.AirPlanesRaces.RACES.RacesDTO;

import java10x.dev.AirPlanesRaces.RACES.RaceModel;
import org.springframework.stereotype.Component;

@Component
public class RaceMapper {

public RaceModel map(RaceDTO raceDTO){
    RaceModel raceModel = new RaceModel();
    raceModel.setId(raceDTO.getId());
    raceModel.setNome(raceDTO.getNome());
    raceModel.setPremio(raceDTO.getPremio());
    raceModel.setColocacao(raceDTO.getColocacao());
    raceModel.setAirplanes(raceDTO.getAirplanes());
    return raceModel;
}

public RaceDTO map(RaceModel raceModel){
    RaceDTO raceDTO = new RaceDTO();
    raceDTO.setNome(raceModel.getNome());
    raceDTO.setAirplanes(raceModel.getAirplanes());
    raceDTO.setColocacao(raceModel.getColocacao());
    raceDTO.setId(raceModel.getId());
    raceDTO.setPremio(raceModel.getPremio());
    return raceDTO;
}


}
