package com.konecta.cafeteria.componet;
import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements  ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("HOLA MUNDO");
    }
}
