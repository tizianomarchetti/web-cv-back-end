package com.service.cv.service.mapper;

import com.service.cv.model.dto.CategorieCompetenzaDto;
import com.service.cv.model.dto.CategorieIstruzioneDto;
import com.service.cv.model.entity.CategorieCompetenza;
import com.service.cv.model.entity.CategorieIstruzione;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CategorieIstruzioneMapper {
	public CategorieIstruzione toEntity(CategorieIstruzioneDto dto) {
		CategorieIstruzione categorieIstruzione = new CategorieIstruzione();
		BeanUtils.copyProperties(dto, categorieIstruzione);
		return categorieIstruzione;
	}

	public CategorieIstruzioneDto toDto(CategorieIstruzione categorieIstruzione) {
		CategorieIstruzioneDto dto = new CategorieIstruzioneDto();
		BeanUtils.copyProperties(categorieIstruzione, dto);
		return dto;
	}
}
