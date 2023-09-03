package com.decko.market.persistence.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    @Column(name = "id_producto")
    private Integer idProducto;
}
