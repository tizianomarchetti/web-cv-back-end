package com.service.cv.controller;

import com.service.cv.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@CrossOrigin
public class AppController {
	@Autowired
	private PdfService pdfService;

	@GetMapping("/getCvPdf/{lang}")
	public ResponseEntity<Resource> getPdf(@PathVariable String lang) throws IOException {
		Resource file = pdfService.getPdf(lang);
		Path path = file.getFile().toPath();

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(path))
				.header(HttpHeaders.CONTENT_DISPOSITION,
						"attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}
}
