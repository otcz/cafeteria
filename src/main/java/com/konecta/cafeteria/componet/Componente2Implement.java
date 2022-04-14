package com.konecta.cafeteria.componet;

import org.springframework.stereotype.Component;

@Component
public class Componente2Implement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("HOLA MUNDO, componente 2");
    }
}
