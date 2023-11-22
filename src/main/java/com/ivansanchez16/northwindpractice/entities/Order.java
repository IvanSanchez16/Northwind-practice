package com.ivansanchez16.northwindpractice.entities;

import com.ivansanchez16.northwindpractice.entities.embbeded.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    @Column(name = "order_id", nullable = false)
    private Short id;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "required_date", nullable = false)
    private LocalDate requiredDate;

    @Column(name = "shipped_date", nullable = false)
    private LocalDate shippedDate;

    @Column(name = "freight", columnDefinition = "REAL NOT NULL")
    private Double freight;

    @Embedded
    @AttributeOverride(name = "address", column = @Column(name = "ship_address"))
    @AttributeOverride(name = "city", column = @Column(name = "ship_city"))
    @AttributeOverride(name = "region", column = @Column(name = "ship_region"))
    @AttributeOverride(name = "postalCode", column = @Column(name = "ship_postal_code"))
    @AttributeOverride(name = "country", column = @Column(name = "ship_country"))
    private Address shipAddress;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "ship_via", nullable = false)
    private Shipper shipper;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "order",  orphanRemoval = true)
    private List<OrderDetail> detail;
}
