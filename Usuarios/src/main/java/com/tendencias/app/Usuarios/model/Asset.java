/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.app.Usuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Bryan
 */
@Data
@AllArgsConstructor
public class Asset {
    
    private byte[] content;
    private String contentType;
}
