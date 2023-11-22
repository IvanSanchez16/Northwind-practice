package com.ivansanchez16.northwindpractice.mappers;

import com.ivansanchez16.northwindpractice.dto.CategoryDTO;
import com.ivansanchez16.northwindpractice.entities.Category;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryMapper {

    public CategoryDTO mapToDTO(Category category) {
        CategoryDTO dto = new CategoryDTO();

        dto.setId( category.getId() );
        dto.setName( category.getName() );
        dto.setDescription( category.getDescription() );

        return dto;
    }
}
