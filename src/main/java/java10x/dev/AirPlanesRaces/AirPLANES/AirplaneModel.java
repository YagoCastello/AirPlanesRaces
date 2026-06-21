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
    @Column(name = "id")
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column(name = "velocidade")
    private int velocidade_max;

    @Column(name = "fabricante")
    private String fabricante;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "races_id")
    private RaceModel races;

}
