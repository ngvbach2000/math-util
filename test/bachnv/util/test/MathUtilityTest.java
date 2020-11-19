/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachnv.util.test;

import bachnv.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngvba
 */
public class MathUtilityTest {
    
    @Test // ki hieju cua Junit dua ra, bien ham sau day thanh psvm, app co nhieu main
    //F6 chay main mac dinh, Shift F6 la chay main ow @Test
    
    //dat ten ham test de test code chinh
    //test thang nao_trang thai gi_ ...
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //xanh chi dat duoc neu tat ca cung xanh, dung het moi tinh huong
    //do chi can it nhat mot thang do, chap bat car thanh phan con lai
    //ham ma da dung thi dung het, sai 1 cai hay vai cai ->ham k dang tin
}

//viet code de test code chinh
//viet code dung thu vie Jnit, xUnit, Jasmine
//xem code chinh chajy on khong truong khi dem qua Qc, KH
//bao dung sai qua mau sac xanh, do
//mat nhin 2 mau xanh do la du, khoi can so sanh ket qua
