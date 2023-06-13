package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.excepciones.BatallaInexistenteException;
import ar.edu.unlam.pb2.excepciones.VehiculoIncompatibleException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;
import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;
import ar.edu.unlam.pb2.interfaces.Volador;
import ar.edu.unlam.pb2.interfazBatalla.FuerzaArmada;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;
import ar.edu.unlam.pb2.vehiculos.Anfibio;
import ar.edu.unlam.pb2.vehiculos.Avion;
import ar.edu.unlam.pb2.vehiculos.Camion;
import ar.edu.unlam.pb2.vehiculos.Destructor;
import ar.edu.unlam.pb2.vehiculos.HidroAvion;
import ar.edu.unlam.pb2.vehiculos.Portaviones;
import ar.edu.unlam.pb2.vehiculos.Submarino;
import ar.edu.unlam.pb2.vehiculos.Tanque;
import ar.edu.unlam.pb2.vehiculos.Vehiculo;



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

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));
		argentina.agregarVehiculo(new Avion(14, "A-10"));
		argentina.agregarVehiculo(new Avion(15, "A-10"));
		argentina.agregarVehiculo(new Avion(16, "F-102"));
		argentina.agregarVehiculo(new Avion(17, "F-15"));
		argentina.agregarVehiculo(new Tanque(18, "Renault FT"));
		argentina.agregarVehiculo(new Camion(19, "T-72"));
		argentina.agregarVehiculo(new Camion(20, "T-72"));
		argentina.agregarVehiculo(new Submarino(21, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(22, "A-10"));
		argentina.agregarVehiculo(new Destructor(23, "A-10"));
		argentina.agregarVehiculo(new Destructor(24, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(25, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(26, "LARC-5"));

		//assertEquals(12, argentina.getCapacidadDeDefensa());
		//assertEquals((Integer)12, argentina.getCapacidadDeDefensa());
		
		Assert.assertEquals(26, argentina.getConvoy().size());
	}

	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		argentina.crearBatalla("Caseros", TipoDeBatalla.TERRESTRE, 10.5, 10.3);
		//argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		//Assert.assertEquals(100.5, argentina.getBatallas().get("San Lorenzo").getLatitud());
		//Assert.assertEquals(100.5, argentina.getBatallas().get("San Lorenzo").getLongitud());
		
		Assert.assertTrue(argentina.getBatallas().get("San Lorenzo").getLatitud() == 100.5);
		Assert.assertTrue(argentina.getBatallas().get("San Lorenzo").getLongitud() == 20.3);
		
		Assert.assertTrue(argentina.getBatallas().get("Caseros").getLatitud() == 10.5);
		Assert.assertTrue(argentina.getBatallas().get("Caseros").getLongitud() == 10.3);
	}
	
	@Test
	public void queSePuedaPlanearLaBatallaSobreElOceano() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("Malvinas", TipoDeBatalla.ACUATICA, 100.5, 20.3);
		
		
		Assert.assertTrue(argentina.getBatallas().get("Malvinas").getLatitud() == 100.5);
		Assert.assertTrue(argentina.getBatallas().get("Malvinas").getLongitud() == 20.3);
		
		
	}
	//throws VehiculoInexistenteException, VehiculoIncompatibleException
	@Test
	public void queSePuedaPresentarBatallaTerrestre() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(10001, "A-10"));
		argentina.agregarVehiculo(new Avion(20002, "A-10"));
		argentina.agregarVehiculo(new Avion(30003, "F-102"));
		argentina.agregarVehiculo(new Avion(40004, "F-15"));
		argentina.agregarVehiculo(new Tanque(50005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(60006, "T-72"));
		argentina.agregarVehiculo(new Camion(70007, "T-72"));
		argentina.agregarVehiculo(new Submarino(80008, "A-10"));
		argentina.agregarVehiculo(new Portaviones(90009, "A-10"));
		argentina.agregarVehiculo(new Destructor(10010, "A-10"));
		argentina.agregarVehiculo(new Destructor(10011, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(10012, "A-10"));
		argentina.agregarVehiculo(new Anfibio(10013, "A-10"));

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		//argentina.presentarBatalla();
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));
		
		assertTrue(argentina.getBatallas().get("San Lorenzo").getVehiculosEnLaBatalla().contains(new Tanque(5, "Renault FT")));
		assertTrue(argentina.getBatallas().get("San Lorenzo").getVehiculosEnLaBatalla().contains(new Camion(6, "T-72")));
		assertTrue(argentina.getBatallas().get("San Lorenzo").getVehiculosEnLaBatalla().contains(new Camion(7, "T-72")));
	}
	
	@Test
	public void queSePuedaPresentarBatallaAcuatica() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(10001, "A-10"));
		argentina.agregarVehiculo(new Avion(20002, "A-10"));
		argentina.agregarVehiculo(new Avion(30003, "F-102"));
		argentina.agregarVehiculo(new Avion(40004, "F-15"));
		argentina.agregarVehiculo(new Tanque(50005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(60006, "T-72"));
		argentina.agregarVehiculo(new Camion(70007, "T-72"));
		argentina.agregarVehiculo(new Submarino(80008, "A-10"));
		argentina.agregarVehiculo(new Portaviones(90009, "A-10"));
		argentina.agregarVehiculo(new Destructor(10010, "A-10"));
		argentina.agregarVehiculo(new Destructor(10011, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(10012, "A-10"));
		argentina.agregarVehiculo(new Anfibio(10013, "A-10"));

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		//argentina.presentarBatalla();
		argentina.crearBatalla("Malvinas", TipoDeBatalla.ACUATICA, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("Malvinas", 80008));
		assertTrue(argentina.enviarALaBatalla("Malvinas", 90009));
		assertTrue(argentina.enviarALaBatalla("Malvinas", 10012));
		
		Assert.assertTrue(argentina.getBatallas().get("Malvinas").getVehiculosEnLaBatalla().contains(new Submarino(80008, "A-10")));
		Assert.assertTrue(argentina.getBatallas().get("Malvinas").getVehiculosEnLaBatalla().contains(new Portaviones(90009, "A-10")));
		Assert.assertTrue(argentina.getBatallas().get("Malvinas").getVehiculosEnLaBatalla().contains(new HidroAvion(10012, "A-10")));
	}
	
	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistenteException,VehiculoIncompatibleException, BatallaInexistenteException {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Submarino(10, "A-10"));
		argentina.agregarVehiculo(new Anfibio(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		
		argentina.crearBatalla("Pacifico", TipoDeBatalla.ACUATICA, 200.5, 45.8);
		
		assertEquals(6, argentina.getConvoy().size());
		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}
	
	@Test (expected = VehiculoIncompatibleException.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistenteException,VehiculoIncompatibleException, BatallaInexistenteException {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}
	
	@Test (expected = VehiculoInexistenteException.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistenteException, VehiculoIncompatibleException, BatallaInexistenteException {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}
	
}
