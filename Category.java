<<<<<<< HEAD
package com.company;

public enum Category {
    SWIMMING,
    FOOTWEAR,
    CLOTHING,
    SIMULATORS;

    public static Category convert(String str) {
        for (Category category : Category.values()) {
            if (category.toString().equals(str)) {
                return category;
            }
        }
        return null;
    }
}
=======
package com.company;

public enum Category {
    SWIMMING,
    FOOTWEAR,
    CLOTHING,
    SIMULATORS
}
>>>>>>> origin/master
