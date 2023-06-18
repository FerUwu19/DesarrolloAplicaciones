package com.tienda.tienda.Service.imp;

import com.tienda.tienda.domain.Categoria;
import com.tienda.tienda.dao.CategoriaDao;
import com.tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImp implements CategoriaService {
     @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if(activos){
            lista.removeIf(categoriaEletemento -> !categoriaEletemento.isActivo() );
        }
        return lista;        
    }

}
