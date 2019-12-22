package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class ClassAssess {
    public String pub = "public公开";
    protected String pro = "pritected保护";
    String def = "default默认";
    private String pri = "private私有";

    public String getPubub() {
        return pub;
    }
    protected String getPro() {
        return pro;
    }
    String getDef() {
        return def;
    }
    private String getPri() {
        return pri;
    }

    @Test
    public void testInnerAcl() {
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);
    }
}
