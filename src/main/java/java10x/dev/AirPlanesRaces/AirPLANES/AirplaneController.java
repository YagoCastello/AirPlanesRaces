package java10x.dev.AirPlanesRaces.AirPLANES;

import java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO.AirplaneDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarAirplane(@RequestBody AirplaneDTO airplane){
        AirplaneDTO airplaneNovo = airplaneService.criarAirplane(airplane);
        return  ResponseEntity.status(HttpStatus.CREATED)
                .body("Airplane criado com sucesso "+ airplaneNovo.getNome()+ ", id: "+airplaneNovo.getId());
    }

// Mostar Airplane por ID(READ)
@GetMapping("/listar/{id}")
    public ResponseEntity<?> listarAirplanePorID(@PathVariable Long id){
    AirplaneDTO airplaneDTO = airplaneService.listarAirplanePorId(id);
    if(airplaneDTO!=null){
        return ResponseEntity.ok(airplaneDTO);
    }else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Airplane com ID: "+id+" Não foi encontrado!!");
    }
    }



// Mostrar todos os Airplanes(READ)
@GetMapping("/listar")
public ResponseEntity<List<AirplaneDTO>> listarAirplane(){
        List<AirplaneDTO> airplaneDTOList =  airplaneService.listarAirplane();
        return ResponseEntity.ok(airplaneDTOList);
}



// Alterar dados dos Airplanes(UPDATE)
@PutMapping("/alterar/{id}")
    public ResponseEntity<String> alterarAirplaneId(@PathVariable Long id, @RequestBody AirplaneDTO airplaneAlterado){
        AirplaneDTO airplaneAtualizado = airplaneService.atualizarAirplane(id,airplaneAlterado);
        if(airplaneAtualizado != null){
            return ResponseEntity.ok("O airplane de id: "+ id+" foi atualizado com sucesso");

        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O airplane de id: "+id +" ,não foi localizado");
        }


}

// Deletar Airplane(DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarAirplane(@PathVariable Long id){
    if (airplaneService.listarAirplanePorId(id) != null){
    airplaneService.deletarAirplanePorId(id);
        return  ResponseEntity.ok("Airplane com o Id: "+id+ " foi deletado com sucesso.");
    }else{
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("O airplane com o id: "+id+" NÃO FOI ENCONTRADO!");
    }
}











}

