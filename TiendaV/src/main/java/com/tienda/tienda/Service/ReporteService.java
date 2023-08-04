/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.Service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author mfsv_
 */
public interface ReporteService {
    
    public ResponseEntity <Resource> generarReporte(
        String reporte,
        Map<String, Object> parametros,
        String tipo
    ) throws IOException;
}
