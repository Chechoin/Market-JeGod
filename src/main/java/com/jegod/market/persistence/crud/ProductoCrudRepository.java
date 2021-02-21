package com.jegod.market.persistence.crud;

import com.jegod.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

//Para usar CrudRepository hay que enviarle el nombre de la clase de la tabla y el tipo de
//dato de su clave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
