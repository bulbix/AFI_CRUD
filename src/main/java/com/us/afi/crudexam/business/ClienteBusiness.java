package com.us.afi.crudexam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.us.afi.crudexam.dao.ClienteDAO;

@Service
public class ClienteBusiness {
	
	@Autowired
	ClienteDAO clienteDAO;
	
	
	

}
