package com.service.cv.service.impl;

import com.service.cv.service.PdfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Service
public class PdfServiceImpl implements PdfService {
	@Value("${files.path}")
	private String filesPath;

	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Resource getPdf(String lang) {
		try {
			URI uri = new ClassPathResource(filesPath
					+ "CV Tiziano Marchetti_" + lang + ".pdf").getFile().toURI();
			log.info(uri.toString());
			Resource resource = new UrlResource(uri);

			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("Could not read the file!");
			}

//			Path file = Paths.get(filesPath).resolve("CV Tiziano Marchetti_" + lang + ".pdf");
//			Resource resource = new UrlResource(file.toUri());
//			log.info(filesPath);
//			log.info(file.toString());
//			log.info(resource.getURI().toString());
//			log.info(resource.getURL().toString());
//			if (resource.exists() || resource.isReadable()) {
//				return resource;
//			} else {
//				throw new RuntimeException("Could not read the file!");
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
