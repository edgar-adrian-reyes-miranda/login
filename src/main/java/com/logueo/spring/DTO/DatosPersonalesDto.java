package com.logueo.spring.DTO;

import java.io.Serializable;
import java.util.*;

import com.logueo.spring.Entity.DatosEscolares;
import com.logueo.spring.Entity.DatosFTD;
import com.logueo.spring.Entity.DatosIngresos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
@Data
public class DatosPersonalesDto implements Serializable {

    private static final long serialVersionUID=1L;
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    @Size(max=18, message = "EL numero de caracteres de CURP son 18")
    private String curp;
    private String direccion;
    private String estados;
    private String municipio;
    @Min(value = 10, message = "Ingrese su edad")
    private Integer edad;
    @Digits(integer=10, fraction = 0, message ="El maximo de numero de digitos son 10" )
    private Long telefono;
    @Digits(integer=10, fraction = 0, message = "El maximo de numero son 10 digitos")
    private Long telefono_casa;
    private String correo;
    private String genero;
    private Set<DatosIngresos> ingresos= new HashSet<>();
    private Set<DatosFTD> ftd= new HashSet<>();
    private Set<DatosEscolares> escolares= new HashSet<>();
}
