package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CittaDto {

	private Long id;

	private String nome;

	private String provincia;

	private List<EntiDto> entiList;
}
