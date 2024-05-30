import controller.HouseController;
import model.House;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseController houseController = new HouseController();
        HouseService houseService = new HouseService();

        List<House> houseList = houseController.getHouseList();
        List<House> villaList = houseController.getVillaList();
        List<House> summerhouseList = houseController.getSummerhouseList();
        List<House> allHouses = houseController.getAllHouses();

        System.out.println("Total price of Houses: " + houseService.getTotalPrice(houseList));
        System.out.println("Total price of Villas: " + houseService.getTotalPrice(villaList));
        System.out.println("Total price of Summerhouses: " + houseService.getTotalPrice(summerhouseList));
        System.out.println("Total price of all houses: " + houseService.getTotalPrice(allHouses));

        System.out.println("Average square meters of Houses: " + houseService.getAverageSquareMeters(houseList));
        System.out.println("Average square meters of Villas: " + houseService.getAverageSquareMeters(villaList));
        System.out.println("Average square meters of Summerhouses: " + houseService.getAverageSquareMeters(summerhouseList));
        System.out.println("Average square meters of all houses: " + houseService.getAverageSquareMeters(allHouses));

        int rooms = 3;
        int livingRooms = 1;
        List<House> filteredHouses = houseService.filterHousesByRoomAndLivingRoom(allHouses, rooms, livingRooms);
        System.out.println("Houses with " + rooms + " rooms and " + livingRooms + " living rooms: " + filteredHouses.size());
    }
}

