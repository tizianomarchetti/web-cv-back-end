package com.service.cv.service.mapper;

import com.service.cv.model.dto.ContattiDto;
import com.service.cv.model.dto.LingueSitoDto;
import com.service.cv.model.entity.Contatti;
import com.service.cv.model.entity.LingueSito;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LingueSitoMapper {
	public LingueSito toEntity(LingueSitoDto dto) {
		LingueSito lingueSito = new LingueSito();
		BeanUtils.copyProperties(dto, lingueSito);
		return lingueSito;
	}

	public LingueSitoDto toDto(LingueSito lingueSito) {
		LingueSitoDto dto = new LingueSitoDto();
		BeanUtils.copyProperties(lingueSito, dto);
		return dto;
	}
}
