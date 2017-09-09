package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by wang on 2017/9/6.
 */
public class BigDecimalTest {

    @Test
    public void test(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
//        0.060000000000000005
//        0.5800000000000001
//        401.49999999999994
//        1.2329999999999999


    }
    @Test
    public void test2(){
        BigDecimal b1 = new BigDecimal(0.01);
        BigDecimal b2 = new BigDecimal(0.02);
        System.out.println(b1.add(b2));

    }

    @Test
    public void test3(){
        BigDecimal b1 = new BigDecimal("0.01");
        BigDecimal b2 = new BigDecimal("0.02");
        System.out.println(b1.add(b2));
    }

}
