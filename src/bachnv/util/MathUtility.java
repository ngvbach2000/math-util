/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachnv.util;

/**
 *
 * @author ngvba
 */
public class MathUtility {

    //lam hang fake giong hang that
    //JDK co class java.ultis.Math, co 1 loat \ham static
    // .abs(), .sin()
    public static final double PI = 3.14;

    //ham tinh n! = 1.2.3.4..n!
    //n! tnag nhanh nen minh chi tinh 20! toi da, 21! tran long
    // 0! = 1! = 1, quy uoc
    //ko co am giai thua
    //neu n ma la am, minh chui, nem ve exception
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 1 .. 20");
        }
        if (n == 0 || n == 1) {
            return 1;
            //song sot den lenh nay la 1 = 2 den 20
            //thang nao xai esle biet tay ong
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
