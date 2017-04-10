package com.company;

public class RentUnit {
    private SportEquipment[] units;
    private static int i = 0;

    public void rent(SportEquipment sportEquipment) {
        if(i <= 2) {
            units[i] = sportEquipment;
            Shop shop = Shop.getInstance();
            shop.PickUpFromStock(sportEquipment);
            i++;
        } else{
            System.out.println("Нельзя брать в аренду больше 3 единиц!");
        }
    }

    public void showRentUnits(){
        for (int j = 0; j < units.length; j++) {
            System.out.println(units[i].getTitle());
        }
    }

}
