package com.jegod.market.persistence.crud;

import com.jegod.market.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Para usar CrudRepository hay que enviarle el nombre de la clase de la tabla y el tipo de
//dato de su clave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Es posible hacer la consulta usando @Query o la función mostrada abajo findBy____
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    //List<Producto> getByCategoria(int idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}

