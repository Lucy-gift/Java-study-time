package com.lucygift.java.demo1.inteference;

import java.util.Date;

public class Employee {
    private String name;
    private Date hireDate;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
//    public Employee(String name,Date hireDate,Integer salary) {
//        this.name = name;
//        this.hireDate = hireDate;
//        this.salary =salary;
//        System.out.println("使用 Employee 有参数构造");
//    }
    public void printInfo() {
        StringBuilder temp = new StringBuilder();
        temp.append("姓名：");
        temp.append(getName());
        temp.append("，入职时间：");
        temp.append(getHireDate());
        temp.append("，薪水标准：");
        temp.append(getSalary());
//        temp.append(String.format("姓名： %s ,入职时间：%l ,薪水标准：%d",getName(),getHireDate(),getSalary()));

        System.out.println(temp.toString());
    }
}
