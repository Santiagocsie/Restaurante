package com.sangroup.restaurante.servicio;

import com.sangroup.restaurante.modelo.Entidad.plato;
import com.sangroup.restaurante.modelo.Repositorio.PlatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService {

    @Autowired
    private PlatoRepositorio repositorio;

    public List<plato> ListarPlatos(){
    return repositorio.findAll();
    }

    public void GuardarPlato(plato plato){
    repositorio.save(plato);
    }

    public plato ObtenerPlatoPorId(Integer id){
    return repositorio.findById(id).get();
    }

    public void EliminarPlato(Integer id){
        repositorio.deleteById(id);
    }

}
