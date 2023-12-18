package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "LISTE_DETTAGLIO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListeDettaglio {

	@Id
	@SequenceGenerator(
			name = "LISTE_DETTAGLIO_GENERATOR",
			sequenceName = "LISTE_DETTAGLIO_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "LISTE_DETTAGLIO_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_STUDI")
	private Studi studi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LAVORI")
	private Lavori lavori;

}
