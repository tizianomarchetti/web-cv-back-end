package com.service.cv.service.mapper;

import com.service.cv.model.dto.CategorieCompetenzaDto;
import com.service.cv.model.dto.LingueDto;
import com.service.cv.model.dto.LivelliLingueDto;
import com.service.cv.model.entity.CategorieCompetenza;
import com.service.cv.model.entity.Lingue;
import com.service.cv.model.entity.ListeDettaglio;
import com.service.cv.model.entity.LivelliLingue;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LivelliLingueMapper {
	@Autowired LingueMapper lingueMapper;

	public LivelliLingue toEntity(LivelliLingueDto dto) {
		LivelliLingue livelliLingue = new LivelliLingue();
		BeanUtils.copyProperties(dto, livelliLingue);

		if (dto.getLingueList() != null) {
			List<Lingue> lingueList = new ArrayList<>();
			dto.getLingueList().forEach(dett -> {
				lingueList.add(lingueMapper.toEntity(dett));
			});
			livelliLingue.setLingueList(lingueList);
		}

		return livelliLingue;
	}

	public LivelliLingueDto toDto(LivelliLingue livelliLingue) {
		LivelliLingueDto dto = new LivelliLingueDto();
		BeanUtils.copyProperties(livelliLingue, dto);

		if (livelliLingue.getLingueList() != null) {
			List<LingueDto> lingueList = new ArrayList<>();
			livelliLingue.getLingueList().forEach(dett -> {
				lingueList.add(lingueMapper.toDto(dett));
			});
			dto.setLingueList(lingueList);
		}

		return dto;
	}
}
