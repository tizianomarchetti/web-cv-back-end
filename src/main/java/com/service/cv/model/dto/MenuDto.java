package com.service.cv.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {

	private Long id;

	private String codice;

	private String label;

	private String url;

	private String redirectUrl;

	private String icon;

}
