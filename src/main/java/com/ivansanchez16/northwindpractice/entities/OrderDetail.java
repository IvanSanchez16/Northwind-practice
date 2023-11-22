package com.ivansanchez16.northwindpractice.entities;

import com.ivansanchez16.northwindpractice.entities.composite_keys.OrderDetailKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetail {

    @EmbeddedId
    private OrderDetailKey orderDetailKey;

    @Column(name = "unit_price", columnDefinition = "REAL NOT NULL")
    private Double unitPrice;

    @Column(name = "quantity", nullable = false)
    private Short quantity;

    @Column(name = "discount", columnDefinition = "REAL NOT NULL")
    private Double discount;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @MapsId("orderId")
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @MapsId("productId")
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

}