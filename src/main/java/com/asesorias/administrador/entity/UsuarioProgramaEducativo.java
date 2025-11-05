package com.asesorias.administrador.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario_programa_educativo")
@Data
public class UsuarioProgramaEducativo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "programa_educativo_id")
    private Integer programaEducativoId;
}
