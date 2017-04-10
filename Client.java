package com.company;

public class Client {
    private static int amountRent = 0;
        private static RentUnit rentUnit = new RentUnit();

    void rentUnit(SportEquipment sportEquipment){
        rentUnit.rent(sportEquipment);
    }

    void showRentUnits(){
        rentUnit.showRentUnits();
    }
}
