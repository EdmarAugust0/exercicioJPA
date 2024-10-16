package br.com.edmar.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.edmar.dao.CarroDao;
import br.com.edmar.dao.ICarroDao;
import br.com.edmar.dao.IMarcaDao;
import br.com.edmar.dao.MarcaDao;
import br.com.edmar.domain.Carro;
import br.com.edmar.domain.Marca;

public class CarroTest {
	
	private ICarroDao carroDao;
	
	private IMarcaDao marcaDao;
	
	
	public CarroTest() {
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
		
	}

	@Test
	public void cadastrar() {
		Marca marca = criarMarca("A4");
		
		
		Carro car = new Carro();
		car.setCodigo("Z4");
		car.setModelo("X6");
		car.setCor("Preta");
		car.setMarca(marca);
		car = carroDao.cadastrar(car);
		
		assertNotNull(car);
		assertNotNull(car.getId());
	}
	
	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCodigo(codigo);
		marca.setNome("BMW");
		return marcaDao.cadastrar(marca);
	}
}
