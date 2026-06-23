package java10x.dev.AirPlanesRaces.RACES;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {
    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    //Listar races
    public List<RaceModel> listarRaces(){
        return raceRepository.findAll();
    }
}
