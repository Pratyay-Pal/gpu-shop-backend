package com.gpushop.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpushop.backend.shop.getallgpus.GetAllGpusResponse;
import com.gpushop.backend.sql.dao.gpuinfo.GpuinfoDao;

@RestController
@RequestMapping("/shop")
public class GpuShopPageController {

	@Autowired
	GpuinfoDao gpuinfoDao;
	
	@GetMapping("/getAllGpus")
	public ResponseEntity<?> getAllGpus(){
		GetAllGpusResponse getAllGpusResponse = new GetAllGpusResponse();
		getAllGpusResponse.setGpulist(gpuinfoDao.getAllGpus());
		return new ResponseEntity<GetAllGpusResponse>(getAllGpusResponse, HttpStatus.OK);
	}
	
}
