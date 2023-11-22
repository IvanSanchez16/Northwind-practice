package com.ivansanchez16.northwindpractice.entities.embbeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {

    @Column(name = "address", length = 60, nullable = false)
    private String address;

    @Column(name = "city", length = 30, nullable = false)
    private String city;

    @Column(name = "region", length = 30, nullable = false)
    private String region;

    @Column(name = "postal_code", length = 15, nullable = false)
    private String postalCode;

    @Column(name = "country", length = 30, nullable = false)
    private String country;

}
