package controller;

import model.House;
import model.enums.HouseType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseController {

    private List<House> houses;

    public HouseController() {

        houses = new ArrayList<>();
        houses.add(new House(HouseType.HOUSE, 500000, 120, 3, 1));
        houses.add(new House(HouseType.HOUSE, 600000, 140, 4, 1));
        houses.add(new House(HouseType.HOUSE, 550000, 130, 3, 2));

        houses.add(new House(HouseType.VILLA, 1000000, 300, 5, 2));
        houses.add(new House(HouseType.VILLA, 1200000, 350, 6, 2));
        houses.add(new House(HouseType.VILLA, 1100000, 320, 5, 3));

        houses.add(new House(HouseType.SUMMERHOUSE, 700000, 200, 4, 1));
        houses.add(new House(HouseType.SUMMERHOUSE, 750000, 220, 4, 2));
        houses.add(new House(HouseType.SUMMERHOUSE, 800000, 250, 5, 2));
    }

    public List<House> getHouseList() {
        return houses.stream().filter(house -> house.getType() == HouseType.HOUSE).collect(Collectors.toList());
    }

    public List<House> getVillaList() {
        return houses.stream().filter(house -> house.getType() == HouseType.VILLA).collect(Collectors.toList());
    }

    public List<House> getSummerhouseList() {
        return houses.stream().filter(house -> house.getType() == HouseType.SUMMERHOUSE).collect(Collectors.toList());
    }

    public List<House> getAllHouses() {
        return houses;
    }
}