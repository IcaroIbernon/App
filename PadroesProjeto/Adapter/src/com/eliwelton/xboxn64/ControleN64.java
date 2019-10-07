package com.eliwelton.xboxn64;

public class ControleN64 {
	
	private SensorN64 sensorAQueSeConecta;
	
	public void Conectar(SensorN64 sensor){
		this.sensorAQueSeConecta = sensor;
		sensorAQueSeConecta.conectarN64();
	}

}
