package com.service.cv.service.mapper;

import com.service.cv.model.dto.LingueDto;
import com.service.cv.model.dto.LivelliLingueDto;
import com.service.cv.model.entity.Lingue;
import com.service.cv.model.entity.LivelliLingue;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LingueMapper {
	public Lingue toEntity(LingueDto dto) {
		Lingue lingue = new Lingue();
		BeanUtils.copyProperties(dto, lingue);

		LivelliLingue livelliLingue = new LivelliLingue();
		BeanUtils.copyProperties(dto.getLivelliLingue(), livelliLingue);
		lingue.setLivelliLingue(livelliLingue);

		return lingue;
	}

	public LingueDto toDto(Lingue lingue) {
		LingueDto dto = new LingueDto();
		BeanUtils.copyProperties(lingue, dto);

		LivelliLingueDto livelliLingueDto = new LivelliLingueDto();
		BeanUtils.copyProperties(lingue.getLivelliLingue(), livelliLingueDto);
		dto.setLivelliLingue(livelliLingueDto);

		return dto;
	}
}
