/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.cp.at6exe5.at6exercicio5;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Mussi
 */
public class SomatoriaTest {

    public SomatoriaTest() {
    }
/*
    @Test
    public void somaDeFatoriais2() {
        MathOps mathOpsMock = mock(MathOps.class);
        Primo primoMock = mock(Primo.class);

        int n = 0, retorno = 3628920;
        int[] numeros = {5, 10};

        when(primoMock.ehPrimo(5))
                .thenReturn(true);

        when(primoMock.ehPrimo(10))
                .thenReturn(false);

        when(mathOpsMock.fatorial(5))
                .thenReturn(120);

        when(mathOpsMock.fatorial(10))
                .thenReturn(3628800);

        Somatoria s = new Somatoria(mathOpsMock);
        assertEquals(3628800, s.somaDeFatoriais(numeros, primoMock));
    }
*/
    @Test
    public void somaDeFatoriais5() {
        MathOps mathOpsMock = mock(MathOps.class);
        Primo primoMock = mock(Primo.class);

        int[] numeros = {3, 4, 4, 5};

        when(primoMock.ehPrimo(3))
                .thenReturn(true);

        when(primoMock.ehPrimo(4))
                .thenReturn(false);

        when(primoMock.ehPrimo(5))
                .thenReturn(true);

        when(mathOpsMock.fatorial(3))
                .thenReturn(6);

        when(mathOpsMock.fatorial(4))
                .thenReturn(24);

        when(mathOpsMock.fatorial(5))
                .thenReturn(120);

        Somatoria s = new Somatoria(mathOpsMock);
        assertEquals(48, s.somaDeFatoriais(numeros, primoMock));
    }
}
