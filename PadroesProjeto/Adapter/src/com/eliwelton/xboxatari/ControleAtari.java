package com.eliwelton.xboxatari;

public class ControleAtari {
	
	private SensorAtari sensorAQueSeConecta;
	
	public void Conectar(SensorAtari sensor){
		this.sensorAQueSeConecta = sensor;
		sensorAQueSeConecta.conectarAtari();
	}

}
