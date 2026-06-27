package java10x.dev.AirPlanesRaces.AirPLANES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneDTO;
import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneService {

    private final AirplaneRepository airplaneRepository;
    private final AirplaneMapper airplaneMapper;

    public AirplaneService(AirplaneRepository airplaneRepository, AirplaneMapper airplaneMapper) {
        this.airplaneRepository = airplaneRepository;
        this.airplaneMapper = airplaneMapper;
    }

    // Listar todos os meus airplanes
    public List<AirplaneModel> listarAirplane(){
        return airplaneRepository.findAll();
    }

    public AirplaneModel listarAirplanePorId(Long id){
        Optional<AirplaneModel> airplanePorId = airplaneRepository.findById(id);
        return airplanePorId.orElse(null);

    }


    public AirplaneDTO criarAirplane(AirplaneDTO airplaneDTO){
        AirplaneModel airplane = airplaneMapper.map(airplaneDTO);
        airplane = airplaneRepository.save(airplane);
        return airplaneMapper.map(airplane);
    }

    //Atualizar ninja
    public AirplaneModel atualizarAirplane(Long id,AirplaneModel airplaneAtualizado){
        if(airplaneRepository.existsById(id)){
            airplaneAtualizado.setId(id);
            return  airplaneRepository.save(airplaneAtualizado);
        }
        return null;
    }

    //Deletar airplane
    public void deletarAirplanePorId(Long id){
        airplaneRepository.deleteById(id);
    }
}
