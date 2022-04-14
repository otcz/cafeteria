package com.konecta.cafeteria.bean;

public class MyBenaWithDependencyImplement implements  MyBeanWithDependency{


private  MyOperation myOperation;

    public MyBenaWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printDependency() {
        System.out.println(myOperation.suma(1));
        System.out.println("HOLA DENDE BEAN DEPENDENCY");
    }
}
