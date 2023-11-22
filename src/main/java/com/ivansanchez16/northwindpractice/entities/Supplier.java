package com.ivansanchez16.northwindpractice.entities;

import com.ivansanchez16.northwindpractice.entities.embbeded.Address;
import com.ivansanchez16.northwindpractice.entities.embbeded.Contact;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Supplier {

    @Id
    @Column(name = "supplier_id", nullable = false)
    private Short id;

    @Embedded
    private Contact contact;

    @Embedded
    private Address address;

    @Column(name = "homepage", columnDefinition = "TEXT")
    private String homePage;
}
