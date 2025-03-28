package net.siham.presentation;

import net.siham.dao.DaoImpl;
import net.siham.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("Resultat en Fahrenheit " + metier.calcul());
    }
}