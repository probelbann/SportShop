package com.company;

public class Main {

    public static void main(String[] args) {
        Shop shop = Shop.getInstance();
        Client client = new Client();
        client.rentUnit(new SportEquipment(Category.SIMULATORS, "RunningTrack", 8));
        client.showRentUnits();
        shop.showShopGoods();
    }
}
