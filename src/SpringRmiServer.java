package com.trabajosd.rmi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRmiServer {
    public static void main(String[] args) {
        try {
            AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
            
            System.out.println("Servidor Spring RMI iniciado en el puerto 1099.");
            System.out.println("El servicio CalculatorService está disponible.");
            System.out.println("Presione Ctrl+C para terminar el servidor.");
            
            
        } catch (Exception e) {
            System.err.println("Error al iniciar el servidor Spring RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}