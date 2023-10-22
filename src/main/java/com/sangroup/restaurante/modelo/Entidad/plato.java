package com.sangroup.restaurante.modelo.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_plato;
    private String nombre;
    private float precio;

    public plato (String nombre,float precio){
    super();
    this.nombre=nombre;
    this.precio=precio;
    }

    public plato() {
    super();
    }

    public Integer getId_plato() {
        return id_plato;
    }

    public void setId_plato(Integer id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
