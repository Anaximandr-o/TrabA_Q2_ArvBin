package com.projetoAntonio;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        for(int i = 0; i < 100; i++){
            int qtdNos = gerador.nextInt(100, 10000);
            ArvBinBusca<Integer, Integer> arvore = new ArvBinBusca<>();
            for(int j = 0; j < qtdNos; j++){
                int no = gerador.nextInt(100,1000000);
                arvore.put(no, no);
            }
            arvore.removeLaura(qtdNos);

        }
    }
}