package com.jegod.market.persistence.entity;

import org.springframework.format.number.money.MonetaryAmountFormatter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    private MonetaryAmountFormatter total;

    private Boolean estado;

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public MonetaryAmountFormatter getTotal() {
        return total;
    }

    public void setTotal(MonetaryAmountFormatter total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
