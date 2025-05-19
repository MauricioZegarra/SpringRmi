package com.trabajosd.rmi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRmiClient {
    public static void main(String[] args) {
        try {
            // Inicializar el contexto de Spring
            AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ClientConfig.class);
            
            // Obtener el servicio remoto a través del proxy de Spring
            CalculatorService calculatorService = context.getBean(CalculatorService.class);
            
            // Usar el servicio remoto
            System.out.println("Ejecutando operaciones remotas a través de Spring RMI:");
            int result1 = calculatorService.add(10, 25);
            System.out.println("10 + 25 = " + result1);
            
            int result2 = calculatorService.subtract(50, 15);
            System.out.println("50 - 15 = " + result2);
            
            // Cerrar el contexto
            context.close();
            
        } catch (Exception e) {
            System.err.println("Error en el cliente Spring RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}