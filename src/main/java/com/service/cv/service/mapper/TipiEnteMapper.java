package com.service.cv.service.mapper;

import com.service.cv.model.dto.TipiEnteDto;
import com.service.cv.model.entity.TipiEnte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TipiEnteMapper {
	public TipiEnte toEntity(TipiEnteDto dto) {
		TipiEnte tipiEnte = new TipiEnte();
		BeanUtils.copyProperties(dto, tipiEnte);
		return tipiEnte;
	}

	public TipiEnteDto toDto(TipiEnte tipiEnte) {
		TipiEnteDto dto = new TipiEnteDto();
		BeanUtils.copyProperties(tipiEnte, dto);
		return dto;
	}
}
