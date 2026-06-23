package java10x.dev.AirPlanesRaces.AirPLANES;

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
    public String criarAirplane(){
        return "Airplane criado";
    }

// Mostar Airplane por ID(READ)
@GetMapping("/todosID")
    public String listarTodosID(){
    return "VARIOS AIRPLANES POR ID";
}
// Mostrar todos os Airplanes(READ)
@GetMapping("/todos")
public List<AirplaneModel> listarAirplane(){
        return  airplaneService.listarAirplane();
}



// Alterar dados dos Airplanes(UPDATE)
@PutMapping("/alterarid")
    public String alterarAirplaneId(){
    return "ALTERAR AIRPLANEEEEE";
}

// Deletar Airplane(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarAirplane(){
    return "DELETAR AIRPLANE";
    }









}

