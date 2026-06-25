package java10x.dev.AirPlanesRaces.RACES;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public RaceModel listarRacesPorId(Long id){
        Optional<RaceModel> racePorId = raceRepository.findById(id);
        return  racePorId.orElse(null);
    }

    public RaceModel criarRace(RaceModel race){
        return raceRepository.save(race);
    }

    //deletar
    public void deletarRacePorId(Long id){
        raceRepository.deleteById(id);
    }

}
