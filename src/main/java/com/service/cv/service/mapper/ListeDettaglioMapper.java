package com.service.cv.service.mapper;

import com.service.cv.model.dto.*;
import com.service.cv.model.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ListeDettaglioMapper {
	public ListeDettaglio toEntity(ListeDettaglioDto dto) {
		ListeDettaglio listeDettaglio = new ListeDettaglio();
		BeanUtils.copyProperties(dto, listeDettaglio);

		Studi studi = new Studi();
		BeanUtils.copyProperties(dto.getStudi(), studi);
		listeDettaglio.setStudi(studi);

		Lavori lavori = new Lavori();
		BeanUtils.copyProperties(dto.getLavori(), lavori);
		listeDettaglio.setLavori(lavori);

		return listeDettaglio;
	}

	public ListeDettaglioDto toDto(ListeDettaglio listeDettaglio) {
		ListeDettaglioDto dto = new ListeDettaglioDto();
		BeanUtils.copyProperties(listeDettaglio, dto);

		StudiDto studi = new StudiDto();
		BeanUtils.copyProperties(listeDettaglio.getStudi(), studi);
		dto.setStudi(studi);

		LavoriDto lavori = new LavoriDto();
		BeanUtils.copyProperties(listeDettaglio.getLavori(), lavori);
		dto.setLavori(lavori);

		return dto;
	}
}
