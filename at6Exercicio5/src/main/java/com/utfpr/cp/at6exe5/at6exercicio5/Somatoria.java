/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.cp.at6exe5.at6exercicio5;

/**
 *
 * @author Mussi
 */
public class Somatoria {

    MathOps mathOps;

    public Somatoria(MathOps mathOps) {
        this.mathOps = mathOps;
    }

    /**
     * @param numeros
     * @return a somatoria do fatorial de cada inteiro no array numeros que nao
     * eh primo
     */
    public int somaDeFatoriais(int numeros[], Primo p) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];            
            if (!p.ehPrimo(numero)) {            
                soma += mathOps.fatorial(numero);;
            }
        }        
        return soma;
        //return 0; // não entendi esse retorno 0(zero) a função sempre retornaria 0 na somatoria
    }
}
