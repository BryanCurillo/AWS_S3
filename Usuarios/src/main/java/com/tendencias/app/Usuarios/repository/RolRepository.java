/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;


import com.tendencias.app.Usuarios.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Bryan
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
    @Query(value = "Select * from rol u where u.nombre = :nombre", nativeQuery = true)
    public Rol buscarRol(String nombre);
    
}
