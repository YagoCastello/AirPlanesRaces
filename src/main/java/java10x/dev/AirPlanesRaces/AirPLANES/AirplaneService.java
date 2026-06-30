package java10x.dev.AirPlanesRaces.AirPLANES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneDTO;
import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AirplaneService {

    private final AirplaneRepository airplaneRepository;
    private final AirplaneMapper airplaneMapper;

    public AirplaneService(AirplaneRepository airplaneRepository, AirplaneMapper airplaneMapper) {
        this.airplaneRepository = airplaneRepository;
        this.airplaneMapper = airplaneMapper;
    }

    // Listar todos os meus airplanes
    public List<AirplaneDTO> listarAirplane(){
        List<AirplaneModel> airplanes =airplaneRepository.findAll();
        return airplanes.stream()
                .map(airplaneMapper::map)
                .collect(Collectors.toList());

    }

    public AirplaneDTO listarAirplanePorId(Long id){
        Optional<AirplaneModel> airplanePorId = airplaneRepository.findById(id);
        return airplanePorId.map(airplaneMapper::map).orElse(null);

    }


    public AirplaneDTO criarAirplane(AirplaneDTO airplaneDTO){
        AirplaneModel airplane = airplaneMapper.map(airplaneDTO);
        airplane = airplaneRepository.save(airplane);
        return airplaneMapper.map(airplane);
    }

    //Atualizar ninja
    public AirplaneDTO atualizarAirplane(Long id,AirplaneDTO airplaneDTO){
       Optional<AirplaneModel> airplaneExistente = airplaneRepository.findById(id);
       if(airplaneExistente.isPresent()){
           AirplaneModel airplaneAtualizado = airplaneMapper.map(airplaneDTO);
           airplaneAtualizado.setId(id);
           AirplaneModel airplaneSalvo = airplaneRepository.save(airplaneAtualizado);
           return airplaneMapper.map(airplaneSalvo);
       }
       return null;

    }

    //Deletar airplane
    public void deletarAirplanePorId(Long id){
        airplaneRepository.deleteById(id);
    }
}
