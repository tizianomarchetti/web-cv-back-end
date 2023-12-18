package com.service.cv.controller;

import com.service.cv.model.dto.CittaDto;
import com.service.cv.service.CittaService;
import com.service.cv.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin
public class CittaController {
	@Autowired
	private CittaService cittaService;

	@PostMapping("/citta")
	public ResponseEntity<Long> create(@RequestBody CittaDto cittaDto) {
		return ResponseEntity.ok(cittaService.create(cittaDto));
	}

	@GetMapping("/citta/{id}")
	public ResponseEntity<CittaDto> getById(@PathVariable Long id) {
		return ResponseEntity.ok(cittaService.getById(id));
	}

	@PutMapping("/citta")
	public ResponseEntity<Long> update(@RequestBody CittaDto cittaDto) {
		return ResponseEntity.ok(cittaService.update(cittaDto));
	}

	@DeleteMapping("/citta/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		cittaService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
