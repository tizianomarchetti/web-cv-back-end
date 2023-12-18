package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "COMPETENZE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Competenze {

	@Id
	@SequenceGenerator(
			name = "COMPETENZE_GENERATOR",
			sequenceName = "COMPETENZE_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "COMPETENZE_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "TITOLO")
	private String titolo;

	@Column(name = "SOTTOTITOLO")
	private String sottotitolo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CATEGORIA_COMPETENZA")
	private CategorieCompetenza categorieCompetenza;

	@Column(name = "LIVELLO")
	private Long livello;

}
