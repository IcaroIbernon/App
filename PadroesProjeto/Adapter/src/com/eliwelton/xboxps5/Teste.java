package com.eliwelton.xboxps5;

import com.eliwelton.xboxatari.AdaptadorAtariParaXbox2;
import com.eliwelton.xboxatari.ControleAtari;
import com.eliwelton.xboxn64.AdaptadorN64ParaXbox2;
import com.eliwelton.xboxn64.ControleN64;

public class Teste {

	public static void main(String[] args) {
		
		SensorXbox2 adaptee = new SensorXbox2();
        ControlePS5 target = new ControlePS5();
        ControleN64 target2 = new ControleN64();
        ControleAtari target3 = new ControleAtari();

        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);
        AdaptadorN64ParaXbox2 adapter2 = new AdaptadorN64ParaXbox2(adaptee);
        AdaptadorAtariParaXbox2 adapter3 = new AdaptadorAtariParaXbox2(adaptee);

        System.out.println("Xbox2 - PS5");
        target.Conectar(adapter);
        System.out.println();
        System.out.println("Xbox2 - N64");
        target2.Conectar(adapter2);
        System.out.println();
        System.out.println("Xbox2 - Atari");
        target3.Conectar(adapter3);

	}

}
