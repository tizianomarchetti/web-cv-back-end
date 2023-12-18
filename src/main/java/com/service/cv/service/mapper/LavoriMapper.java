package com.service.cv.service.mapper;

import com.service.cv.model.dto.*;
import com.service.cv.model.entity.Enti;
import com.service.cv.model.entity.Lavori;
import com.service.cv.model.entity.ListeDettaglio;
import com.service.cv.model.entity.Studi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LavoriMapper {
	@Autowired private ListeDettaglioMapper listeDettaglioMapper;

	public Lavori toEntity(LavoriDto dto) {
		Lavori lavori = new Lavori();
		BeanUtils.copyProperties(dto, lavori);

		Enti enti = new Enti();
		BeanUtils.copyProperties(dto.getEnti(), enti);
		lavori.setEnti(enti);

		if (dto.getListeDettaglioList() != null) {
			List<ListeDettaglio> listeDettaglioList = new ArrayList<>();
			dto.getListeDettaglioList().forEach(dett -> {
				listeDettaglioList.add(listeDettaglioMapper.toEntity(dett));
			});
			lavori.setListeDettaglioList(listeDettaglioList);
		}

		return lavori;
	}

	public LavoriDto toDto(Lavori lavori) {
		LavoriDto dto = new LavoriDto();
		BeanUtils.copyProperties(lavori, dto);

		EntiDto enti = new EntiDto();
		BeanUtils.copyProperties(lavori.getEnti(), enti);
		dto.setEnti(enti);

		if (lavori.getListeDettaglioList() != null) {
			List<ListeDettaglioDto> listeDettaglioList = new ArrayList<>();
			lavori.getListeDettaglioList().forEach(dett -> {
				listeDettaglioList.add(listeDettaglioMapper.toDto(dett));
			});
			dto.setListeDettaglioList(listeDettaglioList);
		}

		return dto;
	}
}
