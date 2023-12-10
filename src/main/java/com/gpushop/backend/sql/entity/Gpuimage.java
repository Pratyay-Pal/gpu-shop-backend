package com.gpushop.backend.sql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gpuimage")
public class Gpuimage {
	
	@Id
	@Column(name = "gpuid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gpuid;
	
	@Column(name = "s3bucketkey")
	private String s3bucketkey;

	public int getGpuid() {
		return gpuid;
	}

	public void setGpuid(int gpuid) {
		this.gpuid = gpuid;
	}

	public String getS3bucketkey() {
		return s3bucketkey;
	}

	public void setS3bucketkey(String s3bucketkey) {
		this.s3bucketkey = s3bucketkey;
	}

	public Gpuimage(String s3bucketkey) {
		this.s3bucketkey = s3bucketkey;
	}

	public Gpuimage() {
	}		
}
