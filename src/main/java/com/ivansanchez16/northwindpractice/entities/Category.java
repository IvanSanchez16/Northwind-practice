package com.ivansanchez16.northwindpractice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "category_id", nullable = false)
    private Short id;

    @Column(name = "category_name", length = 15, nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT NOT NULL")
    private String description;

    @Lob
    @JdbcTypeCode(Types.LONGVARBINARY)
    @Column(name = "picture", columnDefinition = "bytea")
    private byte[] image;
}
