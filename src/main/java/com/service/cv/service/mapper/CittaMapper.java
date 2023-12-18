package com.service.cv.service.mapper;

import com.service.cv.model.dto.CittaDto;
import com.service.cv.model.dto.EntiDto;
import com.service.cv.model.entity.Citta;
import com.service.cv.model.entity.Competenze;
import com.service.cv.model.entity.Enti;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CittaMapper {
	@Autowired EntiMapper entiMapper;

	public Citta toEntity(CittaDto dto) {
		Citta citta = new Citta();
		BeanUtils.copyProperties(dto, citta);

		if (dto.getEntiList() != null) {
			List<Enti> entiList = new ArrayList<>();
			dto.getEntiList().forEach(e -> {
				entiList.add(entiMapper.toEntity(e));
			});
			citta.setEntiList(entiList);
		}

		return citta;
	}

	public CittaDto toDto(Citta citta) {
		CittaDto dto = new CittaDto();
		BeanUtils.copyProperties(citta, dto);

		if (citta.getEntiList() != null) {
			List<EntiDto> entiList = new ArrayList<>();
			citta.getEntiList().forEach(e -> {
				entiList.add(entiMapper.toDto(e));
			});
			dto.setEntiList(entiList);
		}

		return dto;
	}
}
