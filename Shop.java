package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Shop {
    private static Shop instance;

    private Map<SportEquipment, Integer> goods;
    private String filePath = "C:\\Users\\leoge\\IdeaProjects\\epam_test\\src\\com\\company\\shopGoods.txt";
    private Integer amount;

    private Shop() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] goodParameters = line.split(" ");
                SportEquipment sportEquipment = new SportEquipment();
                sportEquipment.setCategory(Category.valueOf(goodParameters[0]));
                sportEquipment.setTitle(goodParameters[1]);
                sportEquipment.setPrice(Integer.parseInt(goodParameters[2]));
                amount = Integer.parseInt(goodParameters[3]);
                goods.put(sportEquipment, amount);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public void showShopGoods() {
        goods.forEach((equipment, amount) -> System.out.println(equipment + " " + amount));
    }

    public void PickUpFromStock(SportEquipment sportEquipment) {
        goods.forEach((equipment, amount) -> {if(sportEquipment == equipment){
                    --amount;
                }
            });
    }
}















































