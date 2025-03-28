package net.siham.presentation;

import net.siham.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext =
                new ClassPathXmlApplicationContext("config.xml");
        //get bean avec id
        IMetier metier =(IMetier) springContext.getBean("metier");
        System.out.println("Resultat en Fahrenheit: " + metier.calcul());
    }
}
