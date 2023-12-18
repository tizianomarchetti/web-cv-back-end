package com.service.cv.service.mapper;

import com.service.cv.model.dto.EntiDto;
import com.service.cv.model.dto.ListeDettaglioDto;
import com.service.cv.model.dto.StudiDto;
import com.service.cv.model.entity.Enti;
import com.service.cv.model.entity.ListeDettaglio;
import com.service.cv.model.entity.Studi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudiMapper {
	@Autowired private ListeDettaglioMapper listeDettaglioMapper;

	public Studi toEntity(StudiDto dto) {
		Studi studi = new Studi();
		BeanUtils.copyProperties(dto, studi);

		Enti enti = new Enti();
		BeanUtils.copyProperties(dto.getEnti(), enti);
		studi.setEnti(enti);

		if (dto.getListeDettaglioList() != null) {
			List<ListeDettaglio> listeDettaglioList = new ArrayList<>();
			dto.getListeDettaglioList().forEach(dett -> {
				listeDettaglioList.add(listeDettaglioMapper.toEntity(dett));
			});
			studi.setListeDettaglioList(listeDettaglioList);
		}

		return studi;
	}

	public StudiDto toDto(Studi studi) {
		StudiDto dto = new StudiDto();
		BeanUtils.copyProperties(studi, dto);

		EntiDto enti = new EntiDto();
		BeanUtils.copyProperties(studi.getEnti(), enti);
		dto.setEnti(enti);

		if (studi.getListeDettaglioList() != null) {
			List<ListeDettaglioDto> listeDettaglioList = new ArrayList<>();
			studi.getListeDettaglioList().forEach(dett -> {
				listeDettaglioList.add(listeDettaglioMapper.toDto(dett));
			});
			dto.setListeDettaglioList(listeDettaglioList);
		}

		return dto;
	}
}
