package com.api.schoolmanager.controllers;

import com.api.schoolmanager.dtos.ClassDto;
import com.api.schoolmanager.models.ClassModel;
import com.api.schoolmanager.services.ClassService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/class")
public class ClassController {
    final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ClassDto classDto) {
        var classModel = new ClassModel();
        BeanUtils.copyProperties(classDto, classModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(classService.save(classModel));
    }
}
