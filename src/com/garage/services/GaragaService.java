package com.garage.services;

import com.garage.models.Garage;

import java.util.List;

public interface GaragaService {

    void addGarage(Garage garage);

    Garage getGarage(int id);

    List<Garage> getGarages();

    boolean removeGarage(int id);

}
