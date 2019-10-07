package com.eliwelton.xboxn64;

import com.eliwelton.xboxps5.SensorXbox2;

public class AdaptadorN64ParaXbox2 extends SensorN64 {
	
	private SensorXbox2 adaptee;

    public AdaptadorN64ParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    public void conectarN64() {
        adaptee.conectarXbox2();
        System.out.println("It's me! MARIO!");
    }

}
