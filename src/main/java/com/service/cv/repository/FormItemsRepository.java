package com.service.cv.repository;

import com.service.cv.model.entity.FormItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormItemsRepository extends JpaRepository<FormItems, Long> {
}
