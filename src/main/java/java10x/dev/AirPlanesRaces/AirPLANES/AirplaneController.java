package java10x.dev.AirPlanesRaces.AirPLANES;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AirplaneController {
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
public String listarTodos(){
    return "VARIOS AIRPLANES";
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

