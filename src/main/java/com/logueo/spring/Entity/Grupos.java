package com.logueo.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grupos")
public class Grupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_grupo;
    private String nombre;


    @OneToMany(mappedBy = "grupos", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<DatosFTD> datosFTD;

}
