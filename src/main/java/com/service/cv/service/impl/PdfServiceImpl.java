package com.service.cv.service.impl;

import com.service.cv.service.PdfService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PdfServiceImpl implements PdfService {
	@Value("${files.path}")
	private String filesPath;

	@Override
	public Resource getPdf(String lang) {
		try {
			Path file = Paths.get(filesPath).resolve("CV Tiziano Marchetti_" + lang + ".pdf");
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("Could not read the file!");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
