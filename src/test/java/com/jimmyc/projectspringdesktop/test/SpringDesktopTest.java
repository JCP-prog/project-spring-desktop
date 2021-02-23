/**
 * 
 */
package com.jimmyc.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimmyc.projectspringdesktop.dao.DisqueraDAO;
import com.jimmyc.projectspringdesktop.dao.impl.DisqueraDAOImpl;

/**
 * @author JimmyC
 * Clase de prueba unitaria que permite realizar pruebas con el framework Spring
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAONuevo  = (DisqueraDAO) context.getBean("disqueraDAO");

		DisqueraDAO disqueraSinSpring = new DisqueraDAOImpl();
		DisqueraDAO disqueraSinSpringNuevo = new DisqueraDAOImpl();
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONuevo);
		System.out.println(disqueraSinSpring);
		System.out.println(disqueraSinSpringNuevo);

		/// PROPERTIES
		
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.getProperty("spring-username"));
		
		
	}

}
