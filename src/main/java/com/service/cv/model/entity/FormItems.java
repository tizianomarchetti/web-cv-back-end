package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "FORM_ITEMS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormItems {

	@Id
	@SequenceGenerator(
			name = "FORM_ITEMS_GENERATOR",
			sequenceName = "FORM_ITEMS_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "FORM_ITEMS_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "REQUIRED")
	private Boolean required;

	@Column(name = "INPUT_TYPE")
	private String inputType;

	@Column(name = "TEXTAREA_ROWS")
	private Long textareaRows;

}
