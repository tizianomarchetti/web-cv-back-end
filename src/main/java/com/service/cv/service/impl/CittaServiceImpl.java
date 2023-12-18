package com.service.cv.service.impl;

import com.service.cv.model.dto.CittaDto;
import com.service.cv.model.entity.Citta;
import com.service.cv.repository.CittaRepository;
import com.service.cv.service.CittaService;
import com.service.cv.service.mapper.CittaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CittaServiceImpl implements CittaService {
	@Autowired
	private CittaRepository cittaRepository;
	@Autowired
	private CittaMapper cittaMapper;

	@Override
	public Long create(CittaDto cittaDto) {
		return cittaRepository.save(cittaMapper.toEntity(cittaDto)).getId();
	}

	@Override
	public Long update(CittaDto cittaDto) {
		if (cittaDto.getId() == null) {
			throw new NoSuchElementException();
		}
		return cittaRepository.save(cittaMapper.toEntity(cittaDto)).getId();
	}

	@Override
	public CittaDto getById(Long id) {
		Optional<Citta> byId = cittaRepository.findById(id);
		if (byId.isEmpty()) {
			throw new NoSuchElementException();
		}
		return cittaMapper.toDto(byId.get());
	}

	@Override
	public void deleteById(Long id) {
		cittaRepository.deleteById(id);
	}
}
