package com.ivansanchez16.northwindpractice.services.impl;

import com.ivansanchez16.northwindpractice.entities.Category;
import com.ivansanchez16.northwindpractice.repositories.CategoryRepository;
import com.ivansanchez16.northwindpractice.services.CategoryService;
import io.ivansanchez16.jpautils.PageQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Optional<Category> findById(Short id) {
        return categoryRepository.findById(id);
    }

    @Override
    public PageQuery<Category> findByParams(Map<String, Object> requestParams) {
        return categoryRepository.queryByAttributes(requestParams, Category.class, Short.class);
    }
}
