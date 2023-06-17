/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bryan
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int id_rol;
    
    @Size(min = 2, max = 10, message = "El rol debe tener entre 2 y 10 caracteres")
    @NotBlank(message = "El rol no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 2, max = 50, message = "La descripcion debe tener entre 2 y 50 caracteres")
    @NotBlank(message = "La descripcion no puede estar en blanco")
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "estado")
    private int estado;
    @JsonIgnore
	@OneToMany(mappedBy = "rol")
	private List<Usuario>  ListaUsuario;
}
