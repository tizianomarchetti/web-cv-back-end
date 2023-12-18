package com.service.cv.service;

import com.service.cv.model.dto.CittaDto;

public interface CittaService {
	Long create(CittaDto cittaDto);

	Long update(CittaDto cittaDto);

	CittaDto getById(Long id);

	void deleteById(Long id);
}
