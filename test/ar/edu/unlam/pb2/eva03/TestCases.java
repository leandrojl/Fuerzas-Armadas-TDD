package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TestCases {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Vehiculo avion = new Avion();
		Vehiculo avion1 = new Avion(1, "A-10");
		Volador avion3 = new Avion();

		// assertEquals(0.0, avion.getAltura());
		Assert.assertNotNull(avion);
		Assert.assertNotNull(avion1);
		Assert.assertNotNull(avion3);
	}

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		//Vehiculo tanque = new Terrestre();
		Vehiculo tanque = new Tanque();
		Terrestre tanque1 = new Tanque(5, "Renault FT");

		//Assert.assertEquals(0, tanque.getVelocidad());
		Assert.assertNotNull(tanque);
		Assert.assertNotNull(tanque1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		//Vehiculo submarino = new Acuatico();
		Acuatico submarino1 = new Submarino(8, "ARA - San Juan");
		Vehiculo submarino2 = new Submarino();
		
		//assertEquals(0.0, submarino.getProfundidad());
		
		Assert.assertNotNull(submarino1);
		Assert.assertNotNull(submarino2);
	
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Vehiculo var = new Anfibio();
		Anfibio var1 = new Anfibio(12, "LARC-5");

		//assertEquals(0.0, var.getVelocidad());
		//assertEquals(0.0, var.getProfundidad());
		//assertEquals(0.0, var.getVelocidad(), 0.01);
		//assertEquals(0.0, var.getProfundidad(), 0.01);
		
		Assert.assertNotNull(var);
		Assert.assertNotNull(var1);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		Vehiculo ag600 = new HidroAvion();
		HidroAvion ag6001 = new HidroAvion(12, "AG600");

		//assertEquals(0.0, ag600.getAltitud());
		//assertEquals(0.0, ag600.getProfundidad());
		//assertEquals(0.0, ag600.getAltura(), 0.01);
		//assertEquals(0.0, ag600.getProfundidad(), 0.01);
		
		Assert.assertNotNull(ag600);
		Assert.assertNotNull(ag6001);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new Hidroavion("0012", "A-10"));
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		assertEquals(12, argentina.getCapacidadDeDefensa());
		assertEquals((Integer)12, argentina.getCapacidadDeDefensa());
	}

	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3)
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud());
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud());

	}

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}	

	@Test
	public void queSePuedaPlanearLaBatallaSobreElOceano() {
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new Hidroavion("0012", "A-10"));
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));

		argentina.crearBatalla("Terrestre", 100.5, 20.3, "San Lorenzo")

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		argentina.presentarBatalla()
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));		
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertEquals(12, argentina.getCapacidadDeDefensa());
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}

	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}

	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}
}
