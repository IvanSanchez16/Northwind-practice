package com.ivansanchez16.northwindpractice.dto;

import io.ivansanchez16.apiresponses.Meta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiResponse<T>{

    private Meta meta;
    private T data;

    public ApiResponse(Meta meta) {
        this.meta = meta;
        this.data = null;
    }
}
