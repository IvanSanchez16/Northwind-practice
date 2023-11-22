package com.ivansanchez16.northwindpractice.entities.embbeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Contact {

    @Column(name = "company_name", length = 40, nullable = false)
    private String companyName;

    @Column(name = "contact_name", length = 30)
    private String contactName;

    @Column(name = "contact_title", length = 30)
    private String contactTitle;

    @Column(name = "phone", length = 24)
    private String phone;

    @Column(name = "fax", length = 24)
    private String fax;
}
