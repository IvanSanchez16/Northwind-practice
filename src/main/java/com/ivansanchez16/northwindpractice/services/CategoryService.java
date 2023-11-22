package com.ivansanchez16.northwindpractice.services;

import com.ivansanchez16.northwindpractice.entities.Category;
import io.ivansanchez16.jpautils.PageQuery;

import java.util.Map;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> findById(Short id);

    PageQuery<Category> findByParams(Map<String, Object> requestParams);
}
