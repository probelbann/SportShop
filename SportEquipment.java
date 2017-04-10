<<<<<<< HEAD
package com.company;

public class SportEquipment {
    private Category category;
    private String title;
    private int price;

    public SportEquipment(){

    }

    public SportEquipment(Category category, String title, int price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SportEquipment other = (SportEquipment) obj;
        if (category != other.category)
            return false;
        if (!title.equals(other.title))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString(){
        return this.category + " " + this.title + " " + this.price;
    }
}
=======
package com.company;

public class SportEquipment {
    private Category category;
    private String title;
    private int price;

    public SportEquipment(){

    }

    public SportEquipment(Category category, String title, int price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
>>>>>>> origin/master
