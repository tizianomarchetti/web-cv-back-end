package com.service.cv.service.impl;

import com.service.cv.service.PdfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@Service
public class PdfServiceImpl implements PdfService {
	@Value("${files.path}")
	private String filesPath;

	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Resource getPdf(String lang) {

		Resource resource = new ClassPathResource(filesPath
				+ "CV Tiziano Marchetti_" + lang + ".pdf");
		try {
			log.info(resource.getInputStream().toString());
			// Crea un file temporaneo
			Path tempFile = Files.createTempFile("tempFile", ".pdf");

			log.info(tempFile.toString());

			// Copia i byte dall'InputStream nel file temporaneo
			Files.copy(resource.getInputStream(), tempFile, StandardCopyOption.REPLACE_EXISTING);

			// Restituisci il percorso del file temporaneo
			return new UrlResource(tempFile.toUri());

		} catch (IOException e) {
			// Gestisci eventuali eccezioni durante la lettura o la creazione del file temporaneo
			throw new RuntimeException("Errore durante la manipolazione del file temporaneo", e);
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
//		return null;
	}
}
