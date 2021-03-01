package com.jlondono.HelloController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerApplicationTests {

	@Test
	public void testSaludarConNombre() {

		//give
		String nombre = "Camilo";
		String mensajefinal= "Bienvenido!! Camilo";
		RestControllerSaludo restcontroller = new RestControllerSaludo();
		//when
		String mensaje = restcontroller.SaludarGet(nombre);
		//then
		assert(mensaje.equals(mensajefinal));

	}
	@Test
	public void testSaludarSinNombre() {
		//give
		String name = "";
		String mensajefinal= "Bienvenido!! Usuario desconocido";
		RestControllerSaludo restcontroller = new RestControllerSaludo();
		//when
		String mensaje = restcontroller.SaludarGet(name);
		//then
		assert(mensaje.equals(mensajefinal));
	}

}
