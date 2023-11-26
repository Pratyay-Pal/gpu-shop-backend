package com.gpushop.backend.shop.getallgpus;

import java.util.List;

import com.gpushop.backend.sql.entity.Gpuinfo;

public class GetAllGpusResponse {

	private List<Gpuinfo> gpulist;

	public List<Gpuinfo> getGpulist() {
		return gpulist;
	}

	public void setGpulist(List<Gpuinfo> gpulist) {
		this.gpulist = gpulist;
	}

		
}
