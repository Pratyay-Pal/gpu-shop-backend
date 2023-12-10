package com.gpushop.backend.constants;

public class SqlQueryConstants {

	public static final String getAllGpusSqlQuery="""
			select ginf.gpuid as gpuid, ginf.gpuname as gpuname, ginf.company as company, 
			gedt.price as price, gpimg.s3bucketkey as s3bucketkey from Gpuinfo ginf left join Gpudetails gedt on ginf.gpuid = gedt.gpudetesid 
			left join Gpuimage gpimg on ginf.gpuid = gpimg.gpuid""";
	
}
