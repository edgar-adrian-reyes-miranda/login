package com.logueo.spring.Entity;

import lombok.*;
import jakarta.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String tipo_estatus;
    private String unidad;
}
