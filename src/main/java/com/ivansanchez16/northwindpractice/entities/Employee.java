package com.ivansanchez16.northwindpractice.entities;

import com.ivansanchez16.northwindpractice.entities.embbeded.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @Column(name = "employee_id", nullable = false)
    private Short id;

    @Column(name = "first_name", length = 40, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 40, nullable = false)
    private String lastName;

    @Column(name = "title", length = 30, nullable = false)
    private String title;

    @Column(name = "title_of_courtesy", length = 25, nullable = false)
    private String titleOfCourtesy;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Embedded
    private Address address;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "reports_to")
    private Employee reportsTo;

}
