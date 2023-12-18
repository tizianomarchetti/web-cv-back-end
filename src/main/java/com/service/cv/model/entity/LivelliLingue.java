package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "LIVELLI_LINGUE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivelliLingue {

	@Id
	@SequenceGenerator(
			name = "LIVELLI_LINGUE_GENERATOR",
			sequenceName = "LIVELLI_LINGUE_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "LIVELLI_LINGUE_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "VALORE")
	private Long valore;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@OneToMany(mappedBy = "livelliLingue")
	private List<Lingue> lingueList;

}
