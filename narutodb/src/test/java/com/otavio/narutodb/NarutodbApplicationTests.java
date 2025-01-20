package com.otavio.narutodb;

import com.otavio.narutodb.model.NinjaDeGenjutsu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class NarutodbApplicationTests {


	@Test
	void testNinjaDeGenjutsuBean() {
		NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Itachi", 21, "Konoha", 100, 100);
		assertNotNull(ninja, "NinjaDeGenjutsu bean should be loaded");
	}
}
