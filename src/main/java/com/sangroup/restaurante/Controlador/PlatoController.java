package com.sangroup.restaurante.Controlador;

import com.sangroup.restaurante.modelo.Entidad.plato;
import com.sangroup.restaurante.servicio.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlatoController {

    @Autowired

    private PlatoService servicio;

    @GetMapping("restaurante/platos")
    public List<plato> ListarPlatos(){
        return servicio.ListarPlatos();
    }

    @GetMapping("restaurante/platos/{id}")
    public ResponseEntity<plato> obtenerplato(@PathVariable Integer id){
        try {
            plato plato = servicio.ObtenerPlatoPorId(id);
            return new ResponseEntity<>(plato, HttpStatus.OK);
        }catch (Exception exception){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("restaurante/platos")
    public void GuardarPlato(@RequestBody plato plato){
        servicio.GuardarPlato(plato);
    }

    @PutMapping("restaurante/platos/{id}")
    public ResponseEntity<?> ActualizarPlato(@RequestBody plato plato, @PathVariable Integer id){
        try {
            plato PlatoActual = servicio.ObtenerPlatoPorId(id);

            PlatoActual.setNombre(plato.getNombre());
            PlatoActual.setPrecio(plato.getPrecio());

            servicio.GuardarPlato(PlatoActual);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("restaurante/platos/{id}")
    public void EliminarPlato(@PathVariable Integer id){
        servicio.EliminarPlato(id);
    }

}
