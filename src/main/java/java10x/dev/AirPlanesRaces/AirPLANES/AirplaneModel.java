package java10x.dev.AirPlanesRaces.AirPLANES;

import jakarta.persistence.*;
import java10x.dev.AirPlanesRaces.RACES.RaceModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_airplanes")
public class AirplaneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int velocidade_max;
    private String fabricante;
    private Tipo tipo;
    @ManyToOne
    @JoinColumn(name = "races_id")
    private RaceModel races;

}
