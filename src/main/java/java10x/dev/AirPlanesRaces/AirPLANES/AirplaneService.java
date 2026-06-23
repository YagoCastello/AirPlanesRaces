package java10x.dev.AirPlanesRaces.AirPLANES;

import org.springframework.stereotype.Service;

import java.util.List;
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
}
