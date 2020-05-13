package com.grow.commands;

public enum  Commands {
    PRINT_CARS("print_cars"),
    PRINT_UNSOLD_CARS("print_unsold_cars"),
    PRINT_MOST_EXPENSIVE_CAR("print_most_expensive_car"),
    PRINT_MOTORCYCLES("print_motorcycles"),
    PRINT_UNSOLD_NEW_CARS("print_unsold_new_cars"),
    PRINT_IS_ALL_CARS_SOLD_EXCEPT_YEAR("print_is_all_cars_sold_except_year");

    private String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
