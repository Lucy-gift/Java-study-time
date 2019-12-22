package com.lucygift.java.demo1.inteference;

import org.junit.Test;

import java.util.Date;

public class EmployeeTest {
    @Test
    public void testPrint() {
//        Employee yg1 = new Employee();
//        yg1.setName("员工1");
//        yg1.setHireDate(new Date());
//        yg1.setSalary(100);
//
//        yg1.printInfo();
//
//        Manager jl1 = new Manager();
//        jl1.setName("经理1");
//        jl1.setHireDate(new Date());
//        jl1.setSalary(120);
//        jl1.setBonus(20);
//
//        jl1.printInfo();
//        Employee yg2 = new Employee("员工2",new Date(),100);
//        Manager jl2 = new Manager("经理2",new Date(),120,30);
//        MasterManager zjl2 = new MasterManager("总经理2",new Date(),150,30);
//
////        Employee yg = yg2;
//        yg.printInfo();
//        System.out.println(yg instanceof Employee);
//        System.out.println(yg instanceof Manager);

//        yg = jl2;
//        yg.printInfo();
//        yg = zjl2;
//        yg.printInfo();
////        父类转换子类
//        zjl2 = (MasterManager) yg;
    }

    @Test
    public void testObjectMethod() {
        Employee employee = new Employee();
        System.out.println(employee.getClass().getName());//获取类
        System.out.println(employee.getClass().getSimpleName());//只获取类名
        System.out.println(employee.hashCode());
        System.out.println(employee.toString());

        int [] arr = new int[0];
        System.out.println(arr.getClass().getName());//获取类
        System.out.println(arr.getClass().getSimpleName());//只获取类名
        System.out.println(arr.hashCode());
        System.out.println(arr.toString());

        Employee employee2 = new Manager();
        System.out.println(employee2.getClass().getName());//获取类
        System.out.println(employee2.getClass().getSimpleName());//只获取类名
        System.out.println(employee2.hashCode());
        System.out.println(employee2.toString());

    }
}
