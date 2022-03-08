package com.garage.services;

import com.garage.models.Garage;

import java.util.ArrayList;
import java.util.List;

public class GarageServiceImpl implements GaragaService {
    private List<Garage> garages = new ArrayList<Garage>();

    @Override
    public void addGarage(Garage garage) {
        garages.add(garage);
    }

    @Override
    public Garage getGarage(int id) {
        for(Garage garage : garages){
            if(id == garage.getId()){
                return garage;
            }
        }
        return null;
    }

    @Override
    public List<Garage> getGarages() {
        return garages;
    }

    @Override
    public boolean removeGarage(int id){
        for(Garage garage : garages) {
            if(id == garage.getId()) {
                garages.remove(garage);
                return true;
            }
        }
        return false;
    }
}
