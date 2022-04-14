package com.konecta.cafeteria;

import com.konecta.cafeteria.bean.MyBean;
import com.konecta.cafeteria.bean.MyBeanWithDependency;
import com.konecta.cafeteria.componet.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeteriaApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
    private MyBean myBean;
    private MyBeanWithDependency myBeanWithDependency;

    public CafeteriaApplication(@Qualifier("componente2Implement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency=myBeanWithDependency;

    }

    public static void main(String[] args) {
        SpringApplication.run(CafeteriaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.print();
        myBeanWithDependency.printDependency();
    }
}
