package com.jegod.market.persistence;

import com.jegod.market.persistence.crud.ProductoCrudRepository;
import com.jegod.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
