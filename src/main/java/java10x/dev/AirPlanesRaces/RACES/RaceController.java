package java10x.dev.AirPlanesRaces.RACES;

import java10x.dev.AirPlanesRaces.RACES.RacesDTO.RaceDTO;
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
    // Mostar Airplane por ID(READ)
    @GetMapping("/listar/{id}")
    public RaceModel listarRacePorID(@PathVariable Long id){
        return raceService.listarRacesPorId(id);
    }
    @PostMapping("/criar")
    public RaceDTO CriarRace(@RequestBody RaceDTO raceDTO){
        return raceService.criarRace(raceDTO);
}

@PutMapping("/alterar")
    public String alterarRace(){
        return  "RACE alterada com sucesso";

}
@DeleteMapping("/deletar")
    public  void deletarRace(@PathVariable Long id){
    raceService.deletarRacePorId(id);
}

}

