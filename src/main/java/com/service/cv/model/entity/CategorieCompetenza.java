package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "CATEGORIE_COMPETENZA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorieCompetenza {

	@Id
	@SequenceGenerator(
			name = "CATEGORIE_COMPETENZA_GENERATOR",
			sequenceName = "CATEGORIE_COMPETENZA_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CATEGORIE_COMPETENZA_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "ICONA")
	private String icona;

	@OneToMany(mappedBy = "categorieCompetenza")
	private List<Competenze> competenzeList;

}
