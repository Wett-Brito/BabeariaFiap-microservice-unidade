package com.persistencia.fiap.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="unities")
public class Unity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="unity_id")
    private Long id;

    private String name;

	private String locationDescription;

	private String WorkingHour;

	private String phone;

    private String email;

	public Unity(Long id, String name, String locationDescription, String WorkingHour, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.locationDescription = locationDescription;
		this.WorkingHour = WorkingHour;
		this.phone = phone;
		this.email = email;
	} 


    
    
}
