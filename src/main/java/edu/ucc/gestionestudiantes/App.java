package edu.ucc.gestionestudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Aplicacion principal de spring boot!
 * 
 */
@SpringBootApplication
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);

	
    public static void main( String[] args )
    {
        log.debug("Iniciando la aplicacion de spring");
		SpringApplication.run(App.class);

    }
}
