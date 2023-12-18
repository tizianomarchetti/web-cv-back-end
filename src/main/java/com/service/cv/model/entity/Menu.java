package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "MENU")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

	@Id
	@SequenceGenerator(
			name = "MENU_GENERATOR",
			sequenceName = "MENU_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "MENU_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "URL")
	private String url;

	@Column(name = "REDIRECT_URL")
	private String redirectUrl;

	@Column(name = "ICON")
	private String icon;

}
