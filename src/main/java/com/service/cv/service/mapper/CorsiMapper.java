package com.service.cv.service.mapper;

import com.service.cv.model.dto.CorsiDto;
import com.service.cv.model.dto.EntiDto;
import com.service.cv.model.dto.StudiDto;
import com.service.cv.model.entity.Corsi;
import com.service.cv.model.entity.Enti;
import com.service.cv.model.entity.Studi;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CorsiMapper {
	public Corsi toEntity(CorsiDto dto) {
		Corsi corsi = new Corsi();
		BeanUtils.copyProperties(dto, corsi);

		Enti enti = new Enti();
		BeanUtils.copyProperties(dto.getEnti(), enti);
		corsi.setEnti(enti);

		return corsi;
	}

	public CorsiDto toDto(Corsi corsi) {
		CorsiDto dto = new CorsiDto();
		BeanUtils.copyProperties(corsi, dto);

		EntiDto enti = new EntiDto();
		BeanUtils.copyProperties(corsi.getEnti(), enti);
		dto.setEnti(enti);

		return dto;
	}
}
