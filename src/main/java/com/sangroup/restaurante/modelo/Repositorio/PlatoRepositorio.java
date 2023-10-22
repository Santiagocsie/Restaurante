package com.sangroup.restaurante.modelo.Repositorio;

import com.sangroup.restaurante.modelo.Entidad.plato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepositorio extends JpaRepository <plato,Integer> {
}
