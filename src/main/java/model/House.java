package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.HouseType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {

    private HouseType type;
    private double price;
    private double squareMeters;
    private int rooms;
    private int livingRooms;

}
