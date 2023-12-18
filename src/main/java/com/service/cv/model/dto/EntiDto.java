package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntiDto {

	private Long id;

	private String descrizione;

	private TipiEnteDto tipiEnte;

	private CittaDto citta;

	private List<CorsiDto> corsiList;

	private List<StudiDto> studiList;

	private List<LavoriDto> lavoriList;

}
