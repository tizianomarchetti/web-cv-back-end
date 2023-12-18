package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivelliLingueDto {

	private Long id;

	private Long valore;

	private String descrizione;

	private List<LingueDto> lingueList;

}
