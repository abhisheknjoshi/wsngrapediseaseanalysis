package com.wsnforpmoncrops.GrapeDiseaseAnalysis.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities.Envdata;

@Service
public interface EnvDataPersistenceService {

	 public Envdata getEnvdataReading(int nodeId);
	 public void insertEnvdataReading(Envdata envdata);
	 public void updateEnvdataReading(Envdata envdata,int nodeId);
	 public List<Envdata> getAllEnvdataReading();
	 public void deleteEnvdataReading(int nodeId);
}
