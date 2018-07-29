package com.wsnforpmoncrops.GrapeDiseaseAnalysis.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities.Envdata;

@Repository
public interface GrapeDAORepo extends CrudRepository<Envdata, Integer> {

}
