package com.service.cv.service;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

public interface PdfService {
	Resource getPdf(String lang);
}
