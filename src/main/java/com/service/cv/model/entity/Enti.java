package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "ENTI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enti {

	@Id
	@SequenceGenerator(
			name = "ENTI_GENERATOR",
			sequenceName = "ENTI_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "ENTI_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_TIPO_ENTE")
	private TipiEnte tipiEnte;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CITTA")
	private Citta citta;

	@OneToMany(mappedBy = "enti")
	private List<Corsi> corsiList;

	@OneToMany(mappedBy = "enti")
	private List<Studi> studiList;

	@OneToMany(mappedBy = "enti")
	private List<Lavori> lavoriList;

}
