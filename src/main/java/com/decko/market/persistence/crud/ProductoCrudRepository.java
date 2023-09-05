package com.decko.market.persistence.crud;

import com.decko.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    /* Se puede realizar una consulta directamente (nativa) con @Query
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    es mejor practica usar Query metods porque ofrecen mas flexibilidad  */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
