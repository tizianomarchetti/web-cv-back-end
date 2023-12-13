package com.service.cv.service;

import org.springframework.core.io.Resource;

import java.io.IOException;

public interface PdfService {
	Resource getPdf(String lang) throws IOException;
}
