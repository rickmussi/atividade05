/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv6exercicio5;

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

    @Test
    public void somaDeFatoriais2() {
        MathOps mathOpsMock = mock(MathOps.class);
        PrimoImp p = new PrimoImp();
        int n = 0, retorno = 3628920;
        int[] numeros = {5, 10};
        when(mathOpsMock.fatorial(0))
                .thenReturn(retorno);

        Somatoria s = new Somatoria(mathOpsMock);
        assertEquals(3628920, s.somaDeFatoriais(new int[5], p));
    }

    @Test
    public void somaDeFatoriais5() {
        MathOps mathOpsMock = mock(MathOps.class);
        PrimoImp p = new PrimoImp();
        int n = 0, retorno = 174;
        int[] numeros = {3, 4, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            when(mathOpsMock.fatorial(0))
                    .thenReturn(retorno);
        }

        Somatoria s = new Somatoria(mathOpsMock);
        assertEquals(174, s.somaDeFatoriais(new int[5], p));
    }
}
