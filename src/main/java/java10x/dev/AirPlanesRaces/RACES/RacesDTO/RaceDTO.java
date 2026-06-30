package java10x.dev.AirPlanesRaces.RACES.RacesDTO;

import jakarta.persistence.*;
import java10x.dev.AirPlanesRaces.AirPLANES.AirplaneModel;
import java10x.dev.AirPlanesRaces.RACES.Colocacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class RaceDTO {

    private Long id;
    private String nome;
    private Colocacao colocacao;
    private float premio;
    private List<AirplaneModel> airplanes;

}
