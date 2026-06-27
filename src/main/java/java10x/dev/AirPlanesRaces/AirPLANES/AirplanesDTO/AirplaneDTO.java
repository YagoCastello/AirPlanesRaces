package java10x.dev.AirPlanesRaces.AirPLANES.AirplanesDTO;

import java10x.dev.AirPlanesRaces.AirPLANES.Tipo;
import java10x.dev.AirPlanesRaces.RACES.RaceModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AirplaneDTO {

        private Long id;
        private String nome;
        private int velocidade_max;
        private String fabricante;
        private Tipo tipo;
        private RaceModel races;
        private String piloto;

}
