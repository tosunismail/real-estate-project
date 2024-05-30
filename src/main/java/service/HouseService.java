package service;

import model.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    public double getTotalPrice(List<House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getAverageSquareMeters(List<House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public List<House> filterHousesByRoomAndLivingRoom(List<House> houses, int rooms, int livingRooms) {
        return houses.stream()
                .filter(house -> house.getRooms() == rooms && house.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
