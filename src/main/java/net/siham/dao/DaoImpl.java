package net.siham.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données ");
        double temperature = 27;
        return temperature;
    }

}

