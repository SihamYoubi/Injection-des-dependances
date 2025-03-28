package net.siham.metier;

import net.siham.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao; //couplage faible

    @Override
    public double calcul() {
        double temperature = dao.getData();
        double resultatFahrenheit = (temperature * 1.8) + 32;
        return resultatFahrenheit;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

}
