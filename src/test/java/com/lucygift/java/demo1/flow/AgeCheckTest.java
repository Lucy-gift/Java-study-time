package com.lucygift.java.demo1.flow;

import org.junit.Assert;
import org.junit.Test;

public class AgeCheckTest {

//    String AgeCheck.getAgeName(int age)
    @Test
    public void TestAgeCHeck(){
//        given
        Assert.assertEquals(AgeCheck.getAgeName(6), "儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7), "少年");
        Assert.assertEquals(AgeCheck.getAgeName(28), "青年");
        Assert.assertEquals(AgeCheck.getAgeName(45), "中年");
        Assert.assertEquals(AgeCheck.getAgeName(60), "老年");
        Assert.assertEquals(AgeCheck.getAgeName(80), "老年");

//        when
//        then
    }
}
