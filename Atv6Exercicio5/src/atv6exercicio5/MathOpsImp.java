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
public class MathOpsImp implements MathOps {

    @Override
    public int fatorial(int n) {
        int v = 1,r=0;
        
        v = 1;
        if (n > 0) {
            for (int x = 1; x <= n; x++) {
                v = (x * v);
                r+=v;                
            }
        } else {
            r = 1;
        }
        return r;
    }

}
