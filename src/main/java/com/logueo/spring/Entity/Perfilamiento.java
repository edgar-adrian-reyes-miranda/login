package com.logueo.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import jakarta.persistence.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="perfilamiento")
public class Perfilamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perfilamiento;
    private String nombre;

    @OneToMany(mappedBy = "perfilamiento",fetch = FetchType.EAGER)
    @JsonIgnoreProperties("perfilamiento")
    private List<DatosIngresos>datosIngresos;

}
