package com.eliwelton.xboxatari;

import com.eliwelton.xboxps5.SensorXbox2;

public class AdaptadorAtariParaXbox2 extends SensorAtari {
	
	private SensorXbox2 adaptee;

    public AdaptadorAtariParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    public void conectarAtari() {
        adaptee.conectarXbox2();
        System.out.println("ATARI!");
    }

}
