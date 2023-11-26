package com.gpushop.backend.sql.dao.gpuinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpushop.backend.sql.entity.Gpuinfo;

@Component
public class GpuinfoDaoImpl implements GpuinfoDao{

	@Autowired
	GpuinfoJPA gpuinfoJPA;

	@Override
	public List<Gpuinfo> getAllGpus() {
		return gpuinfoJPA.findAll();
	}
	
	
	
}
