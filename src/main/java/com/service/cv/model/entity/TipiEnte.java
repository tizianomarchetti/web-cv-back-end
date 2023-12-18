package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "TIPI_ENTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipiEnte {

	@Id
	@SequenceGenerator(
			name = "TIPI_ENTE_GENERATOR",
			sequenceName = "TIPI_ENTE_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "TIPI_ENTE_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@OneToMany(mappedBy = "tipiEnte")
	private List<Enti> entiList;

}
