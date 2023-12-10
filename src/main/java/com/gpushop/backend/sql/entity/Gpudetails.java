package com.gpushop.backend.sql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gpudetails")
public class Gpudetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gpudetesid")
	private int gpudetesid;
	
	@Column(name = "gpuname")
	private String gpuname;
	
	@Column(name = "vram")
	private int vram;
	
	@Column(name = "cores")
	private int cores;
	
	@Column(name = "clockspeed")
	private int clockspeed;
	
	@Column(name = "memorytype")
	private String memorytype;
	
	@Column(name = "architecture")
	private String architecture;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "3dmarkscore")
	private int mark3dscore;
}
