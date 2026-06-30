package java10x.dev.AirPlanesRaces.RACES;

import java10x.dev.AirPlanesRaces.RACES.RacesDTO.RaceDTO;
import java10x.dev.AirPlanesRaces.RACES.RacesDTO.RaceMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceService {
    private final RaceRepository raceRepository;
    private final RaceMapper raceMapper;


    public RaceService(RaceRepository raceRepository, RaceMapper raceMapper) {
        this.raceRepository = raceRepository;
        this.raceMapper = raceMapper;
    }

    //Listar races
    public List<RaceModel> listarRaces(){
        return raceRepository.findAll();
    }

    public RaceModel listarRacesPorId(Long id){
        Optional<RaceModel> racePorId = raceRepository.findById(id);
        return  racePorId.orElse(null);
    }

    public RaceDTO criarRace(RaceDTO raceDTO){
        RaceModel race = raceMapper.map(raceDTO);
        race = raceRepository.save(race);
        return raceMapper.map(race);
    }

    //deletar
    public void deletarRacePorId(Long id){
        raceRepository.deleteById(id);
    }

}
