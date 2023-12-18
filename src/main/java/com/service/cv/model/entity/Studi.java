package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "STUDI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studi {

	@Id
	@SequenceGenerator(
			name = "STUDI_GENERATOR",
			sequenceName = "STUDI_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "STUDI_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_ENTE")
	private Enti enti;

	@Column(name = "MESE_DAL")
	private Long meseDal;

	@Column(name = "ANNO_DAL")
	private Long annoDal;

	@Column(name = "MESE_AL")
	private Long meseAl;

	@Column(name = "ANNO_AL")
	private Long annoAl;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@OneToMany(mappedBy = "studi")
	private List<ListeDettaglio> listeDettaglioList;

}
