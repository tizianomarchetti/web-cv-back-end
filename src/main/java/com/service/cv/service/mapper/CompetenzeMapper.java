package com.service.cv.service.mapper;

import com.service.cv.model.dto.CategorieCompetenzaDto;
import com.service.cv.model.dto.CompetenzeDto;
import com.service.cv.model.dto.EntiDto;
import com.service.cv.model.dto.StudiDto;
import com.service.cv.model.entity.CategorieCompetenza;
import com.service.cv.model.entity.Competenze;
import com.service.cv.model.entity.Enti;
import com.service.cv.model.entity.Studi;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CompetenzeMapper {
	public Competenze toEntity(CompetenzeDto dto) {
		Competenze competenze = new Competenze();
		BeanUtils.copyProperties(dto, competenze);

		CategorieCompetenza categorieCompetenza = new CategorieCompetenza();
		BeanUtils.copyProperties(dto.getCategorieCompetenza(), categorieCompetenza);
		competenze.setCategorieCompetenza(categorieCompetenza);

		return competenze;
	}

	public CompetenzeDto toDto(Competenze competenze) {
		CompetenzeDto dto = new CompetenzeDto();
		BeanUtils.copyProperties(competenze, dto);

		CategorieCompetenzaDto categorieCompetenzaDto = new CategorieCompetenzaDto();
		BeanUtils.copyProperties(competenze.getCategorieCompetenza(), categorieCompetenzaDto);
		dto.setCategorieCompetenza(categorieCompetenzaDto);

		return dto;
	}
}
