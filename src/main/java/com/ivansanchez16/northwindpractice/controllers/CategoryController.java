package com.ivansanchez16.northwindpractice.controllers;

import com.ivansanchez16.northwindpractice.dto.ApiResponse;
import com.ivansanchez16.northwindpractice.dto.CategoryDTO;
import com.ivansanchez16.northwindpractice.entities.Category;
import com.ivansanchez16.northwindpractice.mappers.CategoryMapper;
import com.ivansanchez16.northwindpractice.services.CategoryService;
import io.ivansanchez16.apiresponses.Meta;
import io.ivansanchez16.apiresponses.MetaGenerator;
import io.ivansanchez16.jpautils.PageQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final MetaGenerator metaGenerator;
    private final CategoryService categoryService;

    @GetMapping
    public ApiResponse<PageQuery<CategoryDTO>> getByParams(@RequestParam Map<String, Object> requestParams) {
        final PageQuery<Category> categories = categoryService.findByParams(requestParams);

        final List<CategoryDTO> responseList = categories.getRows()
                .stream()
                .map(CategoryMapper::mapToDTO)
                .toList();

        final Meta meta = metaGenerator.crearMetaObject(HttpStatus.OK);
        return new ApiResponse<>(meta, new PageQuery<>(categories.getCount(), responseList));
    }
}
