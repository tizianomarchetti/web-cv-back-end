package com.service.cv.service.mapper;

import com.service.cv.model.dto.CategorieCompetenzaDto;
import com.service.cv.model.dto.CompetenzeDto;
import com.service.cv.model.entity.CategorieCompetenza;
import com.service.cv.model.entity.Competenze;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategorieCompetenzaMapper {
	@Autowired private CompetenzeMapper competenzeMapper;

	public CategorieCompetenza toEntity(CategorieCompetenzaDto dto) {
		CategorieCompetenza categorieCompetenza = new CategorieCompetenza();
		BeanUtils.copyProperties(dto, categorieCompetenza);

		if (dto.getCompetenzeList() != null) {
			List<Competenze> competenzeList = new ArrayList<>();
			dto.getCompetenzeList().forEach(comp -> {
				competenzeList.add(competenzeMapper.toEntity(comp));
			});
			categorieCompetenza.setCompetenzeList(competenzeList);
		}

		return categorieCompetenza;
	}

	public CategorieCompetenzaDto toDto(CategorieCompetenza categorieCompetenza) {
		CategorieCompetenzaDto dto = new CategorieCompetenzaDto();
		BeanUtils.copyProperties(categorieCompetenza, dto);

		if (categorieCompetenza.getCompetenzeList() != null) {
			List<CompetenzeDto> competenzeList = new ArrayList<>();
			categorieCompetenza.getCompetenzeList().forEach(comp -> {
				competenzeList.add(competenzeMapper.toDto(comp));
			});
			dto.setCompetenzeList(competenzeList);
		}

		return dto;
	}
}
