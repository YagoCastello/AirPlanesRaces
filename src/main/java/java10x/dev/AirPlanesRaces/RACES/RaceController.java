package java10x.dev.AirPlanesRaces.RACES;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RaceController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Boas vindas AIRPLANE";
    }
}
