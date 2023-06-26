/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
        
@Service
public interface FirebaseStorageService {
    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "sanrio-320a4.appspot.com";
    final String rutaSuperiorStorage = "sanrio";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "sanrio-320a4-firebase-adminsdk-3tbbg-71eaa24cdc";
}
