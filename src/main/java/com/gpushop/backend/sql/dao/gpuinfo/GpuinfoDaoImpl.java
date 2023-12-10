package com.gpushop.backend.sql.dao.gpuinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Tuple;

@Component
public class GpuinfoDaoImpl implements GpuinfoDao{

	@Autowired
	GpuinfoJPA gpuinfoJPA;

	@Override
	public List<Map<String,String>> getAllGpus() {
		List<Tuple> gpuListTuple = gpuinfoJPA.getAllGpus();
		List<Map<String, String>> gpulist = new ArrayList<>();
		for(Tuple gpuTuple : gpuListTuple) {
			Map<String, String> gpuMap = new HashMap<>();
			gpuMap.put("gpuid", gpuTuple.get("gpuid",Integer.class)+"");
			gpuMap.put("gpuname", gpuTuple.get("gpuname",String.class));
			gpuMap.put("company", gpuTuple.get("company",String.class));
			gpuMap.put("price", gpuTuple.get("price",Integer.class)+"");
			gpuMap.put("s3bucketkey", gpuTuple.get("s3bucketkey",String.class)+"");
			gpulist.add(gpuMap);
		}
		return gpulist;
	}
	
	
	
}
