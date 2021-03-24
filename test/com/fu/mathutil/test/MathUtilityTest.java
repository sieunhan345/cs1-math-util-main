/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import static com.fu.mathutil.MathUtility.*;
import static com.fu.mathutil.MathUtility.getFactorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author giao-lang
 */
public class MathUtilityTest {
    
    @Test //biến hàm này thành main(). Shift F6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;
        long expected = 120;
        long actual =getFactorial(n);
        assertEquals(expected,actual);
        assertEquals(720,getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(2, getFactorial(2));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
     //mau do co 2 TH: ham sai ko nhu ky vong
      //                  ham dung ban ky vong sai
    }
    //ta se di test ham co nem ra ngoai le nhu thiet ke hay ko
    //ham dc thiet ke rang dua tham so n..20 -> tinh dung n!
    //ham dc thiet ke rang dua tham so ca chon , < 0> 20
    //                          nem ra ngoai le canh bao sai tham so ngoai mien gia tri vua tinh
    // neu thay dung la nem ve ngoai le khi dua tham so ca chon
    //thi ket luan ham dung, XANH
    //thay ngoai le khi dua N ca chon , mung roi nuoc mat dung nhu thiet ke
    // ngoai le xuat hien khi 5! thi la ham dung ma ngoai le 
    //thi ko phai la gia tri de so sanh kieu assertEquals()
    //Vay ta phai dung kieu khac 
    //@Test(expected = Exception.class) //ko nen bat muc cao nhat (ko sai) nhung qua tong quat
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
        //cá luôn 2 thằng này phải ném về ngoaị lệ IllegalArgumentException
    }
    public void testFactorialWrongArgumentThrowException(){
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }

   
}
