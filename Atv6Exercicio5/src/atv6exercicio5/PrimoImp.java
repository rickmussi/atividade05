/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv6exercicio5;

/**
 *
 * @author Mussi
 */
public class PrimoImp implements Primo {

    @Override
    public boolean ehPrimo(int n) {
        int aux = n;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {            
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
