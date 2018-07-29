package com.wsnforpmoncrops.GrapeDiseaseAnalysis.Controllers;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities.Envdata;
import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Service.EnvDataPersistenceService;

@RestController
public class EnvDataAceeptorController {

	@Autowired
	private EnvDataPersistenceService envDataPersistenceService;
	
	
	@RequestMapping("/Hello")
	public String gethello() {
		
		return "Hello";
	}
	
	@RequestMapping("/AddRecord")
	public String addRecord() {
		Envdata envdata = new Envdata();
		envdata.setDate(new Date(28072018L));
		envdata.setLightintensity("55");
		envdata.setBattery("12");
		envdata.setRelativehumidity("65");
		envdata.setSoilmoisture("95");
		envdata.setWindspeed("110");
		
		Calendar cal = Calendar.getInstance();
		Date dat = new Date(cal.getTimeInMillis());
		Time tim = new Time(cal.getTimeInMillis());
		envdata.setDate(dat);
		envdata.setTime(tim);
		System.out.println(envdata);
	    envDataPersistenceService.insertEnvdataReading(envdata);	
		return "Record Added";
	}
	
	
}
