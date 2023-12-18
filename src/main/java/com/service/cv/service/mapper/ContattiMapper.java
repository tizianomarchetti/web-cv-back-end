package com.service.cv.service.mapper;

import com.service.cv.model.dto.CategorieCompetenzaDto;
import com.service.cv.model.dto.ContattiDto;
import com.service.cv.model.entity.CategorieCompetenza;
import com.service.cv.model.entity.Contatti;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ContattiMapper {
	public Contatti toEntity(ContattiDto dto) {
		Contatti contatti = new Contatti();
		BeanUtils.copyProperties(dto, contatti);
		return contatti;
	}

	public ContattiDto toDto(Contatti contatti) {
		ContattiDto dto = new ContattiDto();
		BeanUtils.copyProperties(contatti, dto);
		return dto;
	}
}
