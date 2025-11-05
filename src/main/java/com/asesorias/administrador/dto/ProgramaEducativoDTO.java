package com.asesorias.administrador.dto;

import lombok.Data;

@Data
public class ProgramaEducativoDTO {
    private Integer idProgramaEducativo;
    private String nombre;
    private Boolean status;
    private String clave;
    private String descripcion;
}