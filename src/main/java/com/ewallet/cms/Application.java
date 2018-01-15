package com.ewallet.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class principale qui sera lencer par Spring Boot.
 * 
 * @author Diedhiou
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * Methode principale de la classe
	 * 
	 * @param args table qui contient les arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
