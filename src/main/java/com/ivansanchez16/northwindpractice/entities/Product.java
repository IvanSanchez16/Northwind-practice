package com.ivansanchez16.northwindpractice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "product_id", columnDefinition = "uuid not null")
    private UUID uuid;

    @Column(name = "product_name", length = 40, nullable = false)
    private String name;

    @Column(name = "quantity_per_unit", nullable = false)
    private String quantityPerUnit;

    @Column(name = "unit_price", columnDefinition = "real not null")
    private Double unitPrice;

    @Column(name = "units_in_stock", nullable = false)
    private Integer unitsInStock;

    @Column(name = "units_on_order", nullable = false)
    private Integer unitsOnOrder;

    @Column(name = "reorder_level", nullable = false)
    private Short reorderLevel;

    @Column(name = "discontinued", nullable = false)
    private Boolean discontinued;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supplier supplier;
}
