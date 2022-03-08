package com.garage.services;

import com.garage.datas.BikeData;
import com.garage.datas.CarData;
import com.garage.datas.TruckData;

public class DataController {

    public static void main(String[] args) {
        new CarData().run();
        new BikeData().run();
        new TruckData().run();
    }

}
