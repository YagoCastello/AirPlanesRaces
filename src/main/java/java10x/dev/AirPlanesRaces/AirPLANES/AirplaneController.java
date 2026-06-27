package java10x.dev.AirPlanesRaces.AirPLANES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/airplanes")
public class AirplaneController {

    AirplaneService airplaneService;

    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
    return "Boas vindas AIRPLANE";
}


    // Adicionar Airplane (CREATE)
    @PostMapping("/criar")
    public AirplaneDTO criarAirplane(@RequestBody AirplaneDTO airplane){
        return airplaneService.criarAirplane(airplane);
    }

// Mostar Airplane por ID(READ)
@GetMapping("/listar/{id}")
    public AirplaneModel listarAirplanePorID(@PathVariable Long id){
    return airplaneService.listarAirplanePorId(id);
}



// Mostrar todos os Airplanes(READ)
@GetMapping("/listar")
public List<AirplaneModel> listarAirplane(){
        return  airplaneService.listarAirplane();
}



// Alterar dados dos Airplanes(UPDATE)
@PutMapping("/alterar/{id}")
    public AirplaneModel alterarAirplaneId(@PathVariable Long id, @RequestBody AirplaneModel airplaneAlterado){
        return airplaneService.atualizarAirplane(id,airplaneAlterado);

}

// Deletar Airplane(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarAirplane(@PathVariable Long id){
    airplaneService.deletarAirplanePorId(id);
    }









}

