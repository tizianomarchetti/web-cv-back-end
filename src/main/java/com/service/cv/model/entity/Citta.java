package com.service.cv.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "CITTA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citta {

	@Id
	@SequenceGenerator(
			name = "CITTA_GENERATOR",
			sequenceName = "CITTA_SEQ",
			allocationSize=1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CITTA_GENERATOR")
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "PROVINCIA")
	private String provincia;

	@OneToMany(mappedBy = "citta")
	private List<Enti> entiList;

}
