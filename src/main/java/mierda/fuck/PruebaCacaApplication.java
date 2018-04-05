package mierda.fuck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mierda.fuck.config.SecuCacaConfig;
import mierda.fuck.controlo.Ass;

@SpringBootApplication(scanBasePackageClasses = { SecuCacaConfig.class, Ass.class })
public class PruebaCacaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaCacaApplication.class, args);
	}
}
