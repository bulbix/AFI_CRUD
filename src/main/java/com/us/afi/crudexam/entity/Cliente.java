package com.us.afi.crudexam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CLIENTE")
@Getter
@Setter
@ToString
public class Cliente {
	
	@Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
 
    @Column(name = "nombre", length = 64, nullable = false)
    private String nombre;

}
