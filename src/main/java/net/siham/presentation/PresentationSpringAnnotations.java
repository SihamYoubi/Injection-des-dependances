package net.siham.presentation;

import net.siham.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.siham");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Resultat en Fahrenheit: " + metier.calcul());
    }

}
