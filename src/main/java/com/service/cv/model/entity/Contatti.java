package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CONTATTI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contatti {

	@Id
	@SequenceGenerator(
			name = "CONTATTI_GENERATOR",
			sequenceName = "CONTATTI_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CONTATTI_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "HREF")
	private String href;

	@Column(name = "ICON")
	private String icon;

	@Column(name = "COLOR")
	private String color;

}
