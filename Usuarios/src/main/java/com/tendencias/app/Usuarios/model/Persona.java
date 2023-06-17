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
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


/**
 *
 * @author Bryan
 */
@Entity
@Data
@AllArgsConstructor
@Table(name = "Persona")
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;

    @Size(min = 2, max = 20, message = "El nombre debe tener entre 2 y 20 caracteres")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 2, max = 20, message = "El apellido debe tener entre 2 y 20 caracteres")
    @NotBlank(message = "El apellido no puede estar en blanco")
    @Column(name = "apellido")
    private String apellido;

    @NotBlank(message = "El correo no puede estar en blanco")
    @Column(name = "correo")
    private String correo;

    @NotBlank(message = "La cedula no puede estar en blanco")
    @Column(name = "cedula")
    private String cedula;

    @NotBlank(message = "El celular no puede estar en blanco")
    @Column(name = "celular")
    private String celular;

    @Size(min = 2, max = 20, message = "La dirección debe tener entre 2 y 20 caracteres")
    @NotBlank(message = "La dirección no puede estar en blanco")
    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha")
    private Date fecha;
    

    
    @Size(min = 2, max = 15, message = "La instrucción debe tener entre 2 y 15 caracteres")
    @NotBlank(message = "La instrucción no puede estar en blanco")
    @Column(name = "instruccion")
    private String instruccion;
    
        @JsonIgnore
	@OneToMany(mappedBy = "persona")
	
	private List<Usuario>  ListaUsuario;
	
	

}
