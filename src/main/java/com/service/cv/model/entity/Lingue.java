package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "LINGUE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lingue {

	@Id
	@SequenceGenerator(
			name = "LINGUE_GENERATOR",
			sequenceName = "LINGUE_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "LINGUE_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LIVELLO")
	private LivelliLingue livelliLingue;

}
