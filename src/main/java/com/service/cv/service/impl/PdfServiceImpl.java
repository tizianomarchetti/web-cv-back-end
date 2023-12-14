package com.service.cv.service.impl;

import com.service.cv.service.PdfService;
import jakarta.servlet.ServletContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PdfServiceImpl implements PdfService {
	@Value("${files.path}")
	private String filesPath;

	private ServletContext servletContext;

	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Resource getPdf(String lang) throws IOException {
//		InputStream resource = new ClassPathResource("static/CV Tiziano Marchetti_" + lang + ".pdf")
//				.getInputStream();
//
//		log.info(resource.toString());
//
//		InputStreamResource inputStreamResource = new InputStreamResource(resource);
//
//		return inputStreamResource;

		Path file = Paths.get(filesPath).resolve("CV Tiziano Marchetti_" + lang + ".pdf");
		Resource resource = new UrlResource(file.toUri());
		if (resource.exists() || resource.isReadable()) {
			return resource;
		} else {
			throw new RuntimeException("Could not read the file!");
		}
//		return null;
	}
}
