package com.service.cv.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormItemsDto {

	private Long id;

	private String codice;

	private String type;

	private String label;

	private Boolean required;

	private String inputType;

	private Long textareaRows;

}
