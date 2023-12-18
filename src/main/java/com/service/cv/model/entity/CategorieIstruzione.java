package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CATEGORIE_ISTRUZIONE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorieIstruzione {

	@Id
	@SequenceGenerator(
			name = "CATEGORIE_ISTRUZIONE_GENERATOR",
			sequenceName = "CATEGORIE_ISTRUZIONE_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CATEGORIE_ISTRUZIONE_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

}
