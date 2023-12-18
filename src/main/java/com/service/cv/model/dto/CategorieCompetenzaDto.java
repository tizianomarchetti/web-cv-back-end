package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorieCompetenzaDto {

	private Long id;

	private String descrizione;

	private String icona;

	private List<CompetenzeDto> competenzeList;
}
