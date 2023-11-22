package com.ivansanchez16.northwindpractice.entities;

import com.ivansanchez16.northwindpractice.entities.embbeded.Address;
import com.ivansanchez16.northwindpractice.entities.embbeded.Contact;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @Column(name = "customer_id", length = 5, nullable = false)
    private String id;

    @Embedded
    private Contact contact;

    @Embedded
    private Address address;

}
