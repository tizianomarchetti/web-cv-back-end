package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "LINGUE_SITO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LingueSito {

	@Id
	@SequenceGenerator(
			name = "LINGUE_SITO_GENERATOR",
			sequenceName = "LINGUE_SITO_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "LINGUE_SITO_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "ALT_TEXT")
	private String altText;

	@Column(name = "SRC")
	private String src;

}
