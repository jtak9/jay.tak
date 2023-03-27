package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Player {
    private Map map;
    private Room currentRoom;
    private ArrayList<String> items;

    public Player() throws FileNotFoundException {
        map = new Map();
        currentRoom = map.getRooms("1");
        items = new ArrayList<String>();
    }

    public String getCurrentRoomNumber() { return currentRoom.getRoomNumber(); }

    public String getCurrentRoomName() { return currentRoom.getRoomName(); }

    public String getCurrentRoomDesc() { return currentRoom.getRoomDesc(); }

    public boolean isRoomFamiliar() { return currentRoom.isFamiliar(); }

    public ArrayList<String> getCurrentRoomItems() { return currentRoom.getItems(); }

    public String getCurrentRoomPzlID() { return currentRoom.getPzlID(); }

    public Room puzzleFinder(String pzlID) {
        return map.getRooms(pzlID);
    }

    public Room itemFinder(String items) {
        return map.getRooms(items);
    }
    public Room travel(String roomNumber) {
        currentRoom.setFamiliar(true);
        return map.getRooms(roomNumber);
    }

    public void travelNorth() {
        currentRoom = travel(currentRoom.getNorthside());
    }

    public void travelSouth() {
        currentRoom = travel(currentRoom.getSouthside());
    }

    public void travelEast() {
        currentRoom = travel(currentRoom.getEastside());
    }

    public void travelWest() {
        currentRoom = travel(currentRoom.getWestside());
    }

}

