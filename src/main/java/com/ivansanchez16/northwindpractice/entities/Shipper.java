package com.ivansanchez16.northwindpractice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shippers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Shipper {

    @Id
    @Column(name = "shipper_id", nullable = false)
    private Short id;

    @Column(name = "company_name", length = 40, nullable = false)
    private String companyName;

    @Column(name = "phone", length = 24)
    private String phone;

}
