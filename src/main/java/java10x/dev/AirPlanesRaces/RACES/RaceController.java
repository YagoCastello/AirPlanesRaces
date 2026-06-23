package java10x.dev.AirPlanesRaces.RACES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplaneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/race")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/listar")
    public List<RaceModel> listarRaces(){
        return raceService.listarRaces();
    }

    @PostMapping("/criar")
    public String CriarRace(){
        return "Criando uma race";
}

@PutMapping("/alterar")
    public String alterarRace(){
        return  "RACE alterada com sucesso";

}
@DeleteMapping("/deletar")
    public  String deletarRace(){
        return "RACE deletada!";
}

}

