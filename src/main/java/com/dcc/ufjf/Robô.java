package com.dcc.ufjf;

public class Robô {

    public Robô() {}

    public String receberComandos(String comandosEmString) {
        InterpretadorComandos interpretador = new InterpretadorComandosRobô(comandosEmString);
        return interpretador.interpretar();        
    }
}
