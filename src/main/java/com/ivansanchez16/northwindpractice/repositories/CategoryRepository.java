package com.ivansanchez16.northwindpractice.repositories;

import com.ivansanchez16.northwindpractice.entities.Category;

import io.ivansanchez16.jpautils.DynamicRepository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Short>, DynamicRepository<Category, Short> {
}
