package com.gpushop.backend.sql.dao.gpuinfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gpushop.backend.constants.SqlQueryConstants;
import com.gpushop.backend.sql.entity.Gpuinfo;

import jakarta.persistence.Tuple;

public interface GpuinfoJPA extends JpaRepository<Gpuinfo, Integer>{

	@Query(SqlQueryConstants.getAllGpusSqlQuery)
	List<Tuple> getAllGpus();
	
}
