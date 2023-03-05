package com.api.schoolmanager.services;

import com.api.schoolmanager.models.ClassModel;
import com.api.schoolmanager.repositories.ClassRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Transactional
    public ClassModel save(ClassModel classModel) {
        return this.classRepository.save(classModel);
    }
}
