package com.service.cv.service.mapper;

import com.service.cv.model.dto.*;
import com.service.cv.model.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntiMapper {
	@Autowired CorsiMapper corsiMapper;
	@Autowired StudiMapper studiMapper;
	@Autowired LavoriMapper lavoriMapper;

	public Enti toEntity(EntiDto dto) {
		Enti enti = new Enti();
		BeanUtils.copyProperties(dto, enti);

		TipiEnte tipiEnte = new TipiEnte();
		BeanUtils.copyProperties(dto.getTipiEnte(), tipiEnte);
		enti.setTipiEnte(tipiEnte);

		Citta citta = new Citta();
		BeanUtils.copyProperties(dto.getCitta(), citta);
		enti.setCitta(citta);

		if (dto.getCorsiList() != null) {
			List<Corsi> corsiList = new ArrayList<>();
			dto.getCorsiList().forEach(cor -> {
				corsiList.add(corsiMapper.toEntity(cor));
			});
			enti.setCorsiList(corsiList);
		}

		if (dto.getStudiList() != null) {
			List<Studi> studiList = new ArrayList<>();
			dto.getStudiList().forEach(st -> {
				studiList.add(studiMapper.toEntity(st));
			});
			enti.setStudiList(studiList);
		}

		if (dto.getLavoriList() != null) {
			List<Lavori> lavoriList = new ArrayList<>();
			dto.getLavoriList().forEach(lav -> {
				lavoriList.add(lavoriMapper.toEntity(lav));
			});
			enti.setLavoriList(lavoriList);
		}

		return enti;
	}

	public EntiDto toDto(Enti enti) {
		EntiDto dto = new EntiDto();
		BeanUtils.copyProperties(enti, dto);

		TipiEnteDto tipiEnteDto = new TipiEnteDto();
		BeanUtils.copyProperties(enti.getTipiEnte(), tipiEnteDto);
		dto.setTipiEnte(tipiEnteDto);

		CittaDto cittaDto = new CittaDto();
		BeanUtils.copyProperties(enti.getCitta(), cittaDto);
		dto.setCitta(cittaDto);

		if (enti.getCorsiList() != null) {
			List<CorsiDto> corsiList = new ArrayList<>();
			enti.getCorsiList().forEach(cor -> {
				corsiList.add(corsiMapper.toDto(cor));
			});
			dto.setCorsiList(corsiList);
		}

		if (enti.getStudiList() != null) {
			List<StudiDto> studiList = new ArrayList<>();
			enti.getStudiList().forEach(st -> {
				studiList.add(studiMapper.toDto(st));
			});
			dto.setStudiList(studiList);
		}

		if (enti.getLavoriList() != null) {
			List<LavoriDto> lavoriList = new ArrayList<>();
			enti.getLavoriList().forEach(lav -> {
				lavoriList.add(lavoriMapper.toDto(lav));
			});
			dto.setLavoriList(lavoriList);
		}

		return dto;
	}
}
