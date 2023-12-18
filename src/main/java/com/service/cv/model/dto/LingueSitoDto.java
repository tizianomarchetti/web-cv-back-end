package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LingueSitoDto {

	private Long id;

	private String codice;

	private String altText;

	private String src;

}
