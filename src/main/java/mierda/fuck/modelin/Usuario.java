package mierda.fuck.modelin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

// XXX: https://github.com/rzwitserloot/lombok/issues/864
@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long telefono;
	private String tarjeta;
}
