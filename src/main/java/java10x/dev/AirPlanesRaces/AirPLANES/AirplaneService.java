package java10x.dev.AirPlanesRaces.AirPLANES;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneService {

    private final AirplaneRepository airplaneRepository;

    public AirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }


    // Listar todos os meus airplanes
    public List<AirplaneModel> listarAirplane(){
        return airplaneRepository.findAll();
    }

    public AirplaneModel listarAirplanePorId(Long id){
        Optional<AirplaneModel> airplanePorId = airplaneRepository.findById(id);
        return airplanePorId.orElse(null);

    }


    public AirplaneModel criarAirplane(AirplaneModel airplane){
        return airplaneRepository.save(airplane);
    }

    //Deletar airplane
    public void deletarAirplanePorId(Long id){
        airplaneRepository.deleteById(id);
    }
}
