package com.company;

public class RentUnit {
    private SportEquipment[] units = new SportEquipment[3];
    private static int amountRentUnits = 0;

    public void rent(SportEquipment sportEquipment) {
        if(amountRentUnits <= 2) {
            units[amountRentUnits] = sportEquipment;
            Shop shop = Shop.getInstance();
            shop.PickUpFromStock(sportEquipment);
            amountRentUnits++;
        } else{
            System.out.println("Нельзя брать в аренду больше 3 единиц!");
        }
    }

    public void showRentUnits(){
        for (int j = 0; j < units.length; j++) {
            if(units[j] != null) {
                System.out.println(units[j].getTitle());
            }
        }
    }

}
