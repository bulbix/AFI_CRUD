package com.us.afi.crudexam.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.us.afi.crudexam.entity.Cliente;

@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Long> {

}
