package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CORSI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Corsi {

	@Id
	@SequenceGenerator(
			name = "CORSI_GENERATOR",
			sequenceName = "CORSI_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CORSI_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_ENTE")
	private Enti enti;

}
