package com.gpushop.backend.shop.getallgpus;

import java.util.List;
import java.util.Map;

public class GetAllGpusResponse {

	private List<Map<String,String>> gpulist;

	public List<Map<String, String>> getGpulist() {
		return gpulist;
	}

	public void setGpulist(List<Map<String, String>> gpulist) {
		this.gpulist = gpulist;
	}		
}
