package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContattiDto {

	private Long id;

	private String codice;

	private String label;

	private String href;

	private String icon;

	private String color;

}
