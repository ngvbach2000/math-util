/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import bachnv.util.MathUtility;

/**
 *
 * @author ngvba
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactorial(5));
        //tui goi ham tinh giai thua ky vong la 120
        // lat hoi ham chay co ithuc the la may - Actual
        // tui so sanh voi cai toi ki vong truoc khi ham tinh - Expected
        //Actual==Expected, hafm chajy dung cho tinh huong nay , test case nay
        System.out.println("0! = " + MathUtility.getFactorial(0));
        //expected: 1. Actual ? chay moi biet
        //chay xong voi biet ham dung sai 
        System.out.println("-5! = " + MathUtility.getFactorial(-5));
        //e\xpected: dap vao mat IllegalLArgumentException
        //cach text kieu nay la manual
        //vi ta phai dung mat de luan ket qua
        
        //cach xin so, ta dung mau sac xanh do de ket qua dung sai cua ham
        //cach nay goi la TEST AUTOMATION
        //thu 3 ong giang tiep
    }
    
}
