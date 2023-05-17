package ar.edu.unlp.info.oo2.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TopografiaTest {
	private Topografia top;
	private Topografia agua;
	private Topografia tierra;
	
	@BeforeEach
	void setUp() throws Exception {		
		agua = new Agua();
		tierra = new Tierra();
	}

	@DisplayName("Topografia todo Agua")
	@Test
	void testAgua() {
		top = agua;
		assertEquals(1,top.proporcionDeAgua());
	}
	
	@DisplayName("Topografia Mixta Simple")
	@Test
	void testMixtoSimple() {
		List<Topografia> l = new ArrayList<Topografia>();		
		l.add(tierra);
		l.add(tierra);
		l.add(agua);
		l.add(agua);
		top = new Mixta(l);
		assertEquals(0.5, top.proporcionDeAgua());
	}
	
	@DisplayName("Topografia Mixta Compuesta")
	@Test
	void testMixtoCompuesto() {
		List<Topografia> l = new ArrayList<Topografia>();		
		l.add(tierra);		
		l.add(tierra);
		l.add(tierra);
		l.add(agua);
		Mixta mixta = new Mixta(l);
		l = new ArrayList<Topografia>();		
		l.add(agua);
		l.add(agua);
		l.add(agua);
		l.add(mixta);
		top = new Mixta(l);
		assertEquals(0.8125, top.proporcionDeAgua());
	}
	
	@DisplayName("Igual")
	@Test
	void testIgual() {
		List<Topografia> l = new ArrayList<Topografia>();		
		l.add(tierra);		
		l.add(tierra);
		l.add(tierra);
		l.add(agua);
		Mixta mixta = new Mixta(l);
		l = new ArrayList<Topografia>();		
		l.add(agua);
		l.add(agua);
		l.add(agua);
		l.add(mixta);
		top = new Mixta(l);
		assertEquals(false, top.igual(agua));
		assertEquals(false, top.igual(tierra));
		assertEquals(false, top.igual(mixta));
		Topografia t = new Mixta(l);
		assertEquals(true, top.igual(t));
		l = new ArrayList<Topografia>();		
		l.add(agua);
		l.add(tierra);
		l.add(agua);
		l.add(mixta);
		t = new Mixta(l);
		assertEquals(false, top.igual(t));
	}
}
