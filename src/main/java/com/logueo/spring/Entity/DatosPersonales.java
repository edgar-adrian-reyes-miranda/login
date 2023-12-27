package com.logueo.spring.Entity;

import jakarta.validation.constraints.*;
import lombok.*;
import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personales")
public class DatosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_person;
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    @Size(max=18, message = "EL numero de caracteres de CURP son 18")
    private String curp;
    private String direccion;
    @Min(value = 10, message = "Ingrese su edad")
    private Integer edad;
    @Digits(integer=10, fraction=0, message ="El maximo de numero de digitos son 10" )
    private Long telefono;
    @Digits(integer=10,fraction= 0, message = "El maximo de numero son 10 digitos")
    private Long telefono_casa;
    private String correo;
    private String genero;
    
}
