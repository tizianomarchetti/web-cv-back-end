package com.service.cv.model.dto;

import com.service.cv.model.entity.Enti;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudiDto {

	private Long id;

	private EntiDto enti;

	private Long meseDal;

	private Long annoDal;

	private Long meseAl;

	private Long annoAl;

	private String descrizione;

	private List<ListeDettaglioDto> listeDettaglioList;
}
