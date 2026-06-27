package java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplaneModel;
import org.springframework.stereotype.Component;

@Component
public class AirplaneMapper {

public AirplaneModel map(AirplaneDTO airplaneDTO){
    AirplaneModel airplaneModel = new AirplaneModel();
    airplaneModel.setId(airplaneDTO.getId());
    airplaneModel.setNome(airplaneDTO.getNome());
    airplaneModel.setTipo(airplaneDTO.getTipo());
    airplaneModel.setFabricante(airplaneDTO.getFabricante());
    airplaneModel.setRaces(airplaneDTO.getRaces());
    airplaneModel.setPiloto(airplaneDTO.getPiloto());
    airplaneModel.setVelocidade_max(airplaneDTO.getVelocidade_max());
    return airplaneModel;

}


public AirplaneDTO map(AirplaneModel airplaneModel){
    AirplaneDTO airplaneDTO = new AirplaneDTO();
    airplaneDTO.setFabricante(airplaneModel.getFabricante());
    airplaneDTO.setTipo(airplaneModel.getTipo());
    airplaneDTO.setNome(airplaneDTO.getNome());
    airplaneDTO.setPiloto(airplaneModel.getPiloto());
    airplaneDTO.setId(airplaneModel.getId());
    airplaneDTO.setVelocidade_max(airplaneModel.getVelocidade_max());
    airplaneDTO.setRaces(airplaneModel.getRaces());
    return airplaneDTO;

}

}
