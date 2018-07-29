package com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities;

import java.sql.Date;
import java.sql.Time;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "envdata")
public class Envdata {
	
	@Id
	@Column(name = "nodeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int nodeid;
	
	@Column(name = "windspeed")
	public String windspeed;
	
	@Column(name = "relativehumidity")
	public String relativehumidity;
	
	@Column(name = "battery")
	public String battery;
	
	@Column(name = "soilmoisture")
	public String soilmoisture;
	
	@Column(name = "lightintensity")
	public String lightintensity;
	
	@Column(name = "date")
	public Date date;
	
	@Column
	public Time time;
	
	
	public int getNodeid() {
		return nodeid;
	}
	public void setNodeid(int nodeid) {
		this.nodeid = nodeid;
	}
	public String getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(String windspeed) {
		this.windspeed = windspeed;
	}
	public String getRelativehumidity() {
		return relativehumidity;
	}
	public void setRelativehumidity(String relativehumidity) {
		this.relativehumidity = relativehumidity;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getSoilmoisture() {
		return soilmoisture;
	}
	public void setSoilmoisture(String soilmoisture) {
		this.soilmoisture = soilmoisture;
	}
	public String getLightintensity() {
		return lightintensity;
	}
	public void setLightintensity(String lightintensity) {
		this.lightintensity = lightintensity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Envdata [nodeid=" + nodeid + ", windspeed=" + windspeed + ", relativehumidity=" + relativehumidity
				+ ", battery=" + battery + ", soilmoisture=" + soilmoisture + ", lightintensity=" + lightintensity
				+ ", date=" + date + ", time=" + time + "]";
	}

	
}
