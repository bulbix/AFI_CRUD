package com.us.afi.crudexam.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.us.afi.crudexam.entity.Cliente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteDAOTest {
	
	@Autowired
	ClienteDAO clienteDAO;
	
	Logger log = LoggerFactory.getLogger(ClienteDAOTest.class);
	

	@Test
	public void testSave() {
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNombre("Fernando");
		clienteDAO.save(cliente);
		log.info(cliente.toString());
		log.info(clienteDAO.count()+"");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}
	

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
