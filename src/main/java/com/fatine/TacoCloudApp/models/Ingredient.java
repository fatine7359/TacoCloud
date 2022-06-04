package com.fatine.TacoCloudApp.models;

import com.fatine.TacoCloudApp.enumerations.Type;
import lombok.Data;

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

}
