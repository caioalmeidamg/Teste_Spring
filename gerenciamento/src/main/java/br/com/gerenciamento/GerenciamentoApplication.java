package br.com.gerenciamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoApplication.class, args);
	}
	/* esse é o comando que vai char o java no diretório correto e inicializar o spring
	//comanto que executa a aplicação
	 $ cd /home/caio/Projetos/web/gerenciamento ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_wksdhn3y43h3ja44s0g3i3m4.argfile br.com.gerenciamento.GerenciamentoApplication
	 */

}
