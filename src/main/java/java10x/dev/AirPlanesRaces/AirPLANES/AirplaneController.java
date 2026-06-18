package java10x.dev.AirPlanesRaces.AirPLANES;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AirplaneController {
@GetMapping("/boasvindas")
    public String boasvindas(){
    return "Boas vindas AIRPLANE";
}
}
