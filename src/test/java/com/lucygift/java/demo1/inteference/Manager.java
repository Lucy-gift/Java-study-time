package com.lucygift.java.demo1.inteference;

import java.util.Date;

public class Manager extends Employee {
    private Integer bonus;

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
//      子类可以覆盖父类方法
    @Override
    public Integer getSalary() {
        if (bonus == null ) {
            return super.getSalary();
        }
        return super.getSalary() + bonus;
    }

//    public Manager(String name, Date hireDate,Integer salary,Integer bonus) {
//        super(name,hireDate,salary);
//        this.bonus = bonus;
//    }
}
