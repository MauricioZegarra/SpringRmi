package com.trabajosd.rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientConfig {

    @Bean
    public RmiProxyFactoryBean calculatorService() {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://localhost:1099/CalculatorService");
        factoryBean.setServiceInterface(CalculatorService.class);
        return factoryBean;
    }
}