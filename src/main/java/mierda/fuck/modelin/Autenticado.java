package mierda.fuck.modelin;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Autenticado {
	private Boolean authenticated;
}
