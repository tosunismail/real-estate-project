import controller.HouseController;
import model.House;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseController houseController = new HouseController();
        HouseService houseService = new HouseService();

        // Get lists of different types of houses
        List<House> houseList = houseController.getHouseList();
        List<House> villaList = houseController.getVillaList();
        List<House> summerhouseList = houseController.getSummerhouseList();
        List<House> allHouses = houseController.getAllHouses();

        // Print the total prices of each type of house
        System.out.println("Total price of Houses: " + houseService.getTotalPrice(houseList));
        System.out.println("Total price of Villas: " + houseService.getTotalPrice(villaList));
        System.out.println("Total price of Summerhouses: " + houseService.getTotalPrice(summerhouseList));
        System.out.println("Total price of all houses: " + houseService.getTotalPrice(allHouses));

        // Print the average square meters of each type of house
        System.out.println("Average square meters of Houses: " + houseService.getAverageSquareMeters(houseList));
        System.out.println("Average square meters of Villas: " + houseService.getAverageSquareMeters(villaList));
        System.out.println("Average square meters of Summerhouses: " + houseService.getAverageSquareMeters(summerhouseList));
        System.out.println("Average square meters of all houses: " + houseService.getAverageSquareMeters(allHouses));

        // Define criteria for filtering houses
        int rooms = 3;
        int livingRooms = 1;

        // Get a list of houses that match the criteria
        List<House> filteredHouses = houseService.filterHousesByRoomAndLivingRoom(allHouses, rooms, livingRooms);

        // Print the number of houses that match the criteria
        System.out.println("Houses with " + rooms + " rooms and " + livingRooms + " living rooms: " + filteredHouses.size());
    }
}

