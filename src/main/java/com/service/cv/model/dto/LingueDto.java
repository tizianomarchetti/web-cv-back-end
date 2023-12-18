package com.service.cv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LingueDto {

	private Long id;

	private String descrizione;

	private LivelliLingueDto livelliLingue;

}
