package java10x.dev.AirPlanesRaces.RACES;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RaceController {

    @GetMapping("/listar")
    public String listarRace() {
        return "Listando RACE";
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

