package com.avaliacao.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table ("Cliente")
public class Cliente {


	(GenerationType.strategy)
	private Long id;
	
	@NotNull
	@NotBlank
	public String nome;
	
	@NotNull
	@NotBlank
	public String email;
	
	}
}