package com.wsnforpmoncrops.GrapeDiseaseAnalysis.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Dao.GrapeDAORepo;
import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities.Envdata;

@Service
public class EnvDataPersistService implements EnvDataPersistenceService {

	@Autowired
	private GrapeDAORepo grapeDAORepo;
	
	@Override
	public Envdata getEnvdataReading(int nodeId) {
		// TODO Auto-generated method stub
//		Optional<Envdata> optenvdata = grapeDAORepo.findById(nodeId);
		Envdata envdata = grapeDAORepo.findOne(nodeId);
//		envdata.setNodeid(optenvdata.get().getNodeid());
//		envdata.setDate(optenvdata.get().getDate());
//		envdata.setLightintensity(optenvdata.get().getLightintensity());
//		envdata.setBattery(optenvdata.get().getBattery());
//		envdata.setRelativehumidity(optenvdata.get().getRelativehumidity());
//		envdata.setSoilmoisture(optenvdata.get().getSoilmoisture());
//		envdata.setWindspeed(optenvdata.get().getWindspeed());
//		envdata.setTime(optenvdata.get().getTime());
		return envdata;
	}

	@Override
	public void insertEnvdataReading(Envdata envdata) {
		// TODO Auto-generated method stub
		grapeDAORepo.save(envdata);
	}

	@Override
	public void updateEnvdataReading(Envdata envdata, int nodeId) {
		// TODO Auto-generated method stub
//		Optional<Envdata> optenvdata = grapeDAORepo.findById(nodeId);
//		optenvdata.get().setNodeid(nodeId);
//		optenvdata.get().setWindspeed(envdata.getWindspeed());
//		optenvdata.get().setLightintensity(envdata.getLightintensity());
//		optenvdata.get().setSoilmoisture(envdata.getSoilmoisture());
//		optenvdata.get().setRelativehumidity(envdata.getRelativehumidity());
//		optenvdata.get().setBattery(envdata.getBattery());
//		optenvdata.get().setDate(envdata.getDate());
//		optenvdata.get().setTime(envdata.getTime());
		grapeDAORepo.save(envdata);
		
	}

	@Override
	public List<Envdata> getAllEnvdataReading() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void deleteEnvdataReading(int nodeId) {
		// TODO Auto-generated method stub
		
	}
   
//	public Envdata getEnvData(int nodeId) {
//		Envdata envData;
//		
//				return null;
//	}
	
}
