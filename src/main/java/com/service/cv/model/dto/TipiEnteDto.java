package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipiEnteDto {

	private Long id;

	private String descrizione;

	private List<EntiDto> entiList;
}
