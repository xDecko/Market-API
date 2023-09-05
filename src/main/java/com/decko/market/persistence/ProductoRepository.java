package com.decko.market.persistence;

import com.decko.market.persistence.crud.ProductoCrudRepository;
import com.decko.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll () {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
