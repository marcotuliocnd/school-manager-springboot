package com.api.schoolmanager.dtos;

import jakarta.validation.constraints.Size;

public class ClassDto {
    @Size(max = 10)
    private String name;
}
