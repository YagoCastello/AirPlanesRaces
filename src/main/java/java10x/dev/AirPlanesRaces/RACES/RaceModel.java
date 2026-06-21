package java10x.dev.AirPlanesRaces.RACES;


import jakarta.persistence.*;
import java10x.dev.AirPlanesRaces.AirPLANES.AirplaneModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_races")
public class RaceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "colocacao")
    private Colocacao colocacao;

    @Column(name = "premio")
    private float premio;

    @OneToMany(mappedBy = "races")
    private List<AirplaneModel> airplanes;
}
