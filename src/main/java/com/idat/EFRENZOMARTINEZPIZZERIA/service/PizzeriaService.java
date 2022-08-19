package com.idat.EFRENZOMARTINEZPIZZERIA.service;

import java.util.List;

import com.idat.EFRENZOMARTINEZPIZZERIA.model.Pizzeria;



public interface PizzeriaService {
	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
}
