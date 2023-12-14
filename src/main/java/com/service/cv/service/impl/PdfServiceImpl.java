package com.service.cv.service.impl;

import com.service.cv.service.PdfService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class PdfServiceImpl implements PdfService {
	@Value("${files.path}")
	private String filesPath;

	@Override
	public Resource getPdf(String lang) throws IOException {
		InputStream resource = new ClassPathResource(filesPath + "CV Tiziano Marchetti_" + lang + ".pdf")
				.getInputStream();

		return new InputStreamResource(resource);
	}
}
