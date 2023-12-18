package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetenzeDto {

	private Long id;

	private String titolo;

	private String sottotitolo;

	private CategorieCompetenzaDto categorieCompetenza;

	private Long livello;

}
