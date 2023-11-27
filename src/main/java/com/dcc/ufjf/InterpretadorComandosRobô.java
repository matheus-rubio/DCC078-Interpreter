package com.dcc.ufjf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;

public class InterpretadorComandosRobô implements InterpretadorComandos {

    private Queue<InterpretadorComandos> filaInterpretadores;

    public InterpretadorComandosRobô(String comandosEmString) {

        this.filaInterpretadores = new LinkedList<>();
        List<String> comandos = Arrays.asList(comandosEmString.split(" "));
        Iterator<String> iterator = comandos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("esquerda")) {
                filaInterpretadores.add(new Esquerda());
            } else if (elemento.equals("direita")) {
                filaInterpretadores.add(new Direita());
            } else if (elemento.equals("cima")) {
                filaInterpretadores.add(new Cima());
            } else if (elemento.equals("baixo")) {
                filaInterpretadores.add(new Baixo());
            } else {
                throw new IllegalArgumentException("Comando inválido");
            }
        }
    }

    public String interpretar() {
        List<String> comandosInterpretados = new ArrayList<>();
        while (!filaInterpretadores.isEmpty()) {
            InterpretadorComandos interpretador = this.filaInterpretadores.poll();
            comandosInterpretados.add(interpretador.interpretar());
        }
        return comandosInterpretados.toString();
    }
}
