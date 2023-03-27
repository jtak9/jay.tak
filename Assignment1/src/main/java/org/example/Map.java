package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {
    private ArrayList<Room> rooms;
    private ArrayList<Item> items;
    private ArrayList<Puzzle> puzzles;

    public Map() throws FileNotFoundException {
        rooms = new ArrayList<Room>();
        addRooms("rooms.txt");

        items = new ArrayList<Item>();
        addItems("items.txt");

        puzzles = new ArrayList<Puzzle>();
        addPuzzles("puzzles.txt");
    }

    public ArrayList<Room> addRooms(String initMap) {
        ArrayList<Room> addedRooms = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        File inputFile = new File(initMap);

        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNextLine()) {
                tempList.add(input.nextLine());
            }

            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        for (String line : tempList) {
            String[] split = line.split("~");

            String roomNumber = split[0];
            String roomName = split[1];
            String roomDesc = split[2];
            boolean familiar = Boolean.getBoolean(split[3]);
            String directions = split[4];
            String item = split[5];
            String pzlID = split[6];

            String[] direction = directions.split(",");
            String north = direction[0];
            String south = direction[1];
            String east = direction[2];
            String west = direction[3];

            addedRooms.add(new Room(roomNumber, roomName, roomDesc, familiar,
                    north, south, east, west, item, pzlID));
        }
        return addedRooms;
    }

    public ArrayList<Item> addItems(String initItems) {
        ArrayList<Item> addedItems = new ArrayList<>();
        ArrayList<String> tempItems = new ArrayList<>();
        File inputFile = new File(initItems);

        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNextLine()) {
                tempItems.add(input.nextLine());
            }

            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        for (String line : tempItems) {
            String[] split = line.split("~");

            String itemName = split[0];
            String itemDesc = split[1];

            addedItems.add(new Item(itemName, itemDesc));
        }
        return addedItems;
    }

    public ArrayList<Puzzle> addPuzzles(String initPuzzles) {
        ArrayList<Puzzle> addedPuzzles = new ArrayList<>();
        ArrayList<String> tempPuzzles = new ArrayList<>();
        File inputFile = new File(initPuzzles);

        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNextLine()) {
                tempPuzzles.add(input.nextLine());
            }

            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        for (String line : tempPuzzles) {
            String[] split = line.split("~");

            String pzlID = split[0];
            String pzlQues = split[1];
            String pzlAns = split[2];
            String pzlPassed = split[3];
            String pzlFailed = split[4];
            int attempts = Integer.parseInt(split[5]);
            boolean solved = Boolean.getBoolean(split[6]);

            addedPuzzles.add(new Puzzle(pzlID, pzlQues, pzlAns, pzlPassed, pzlFailed,
                    attempts, solved));
        }
        return addedPuzzles;
    }

    public Room getRooms(String roomNumber) {
        if (roomNumber.equals("0")) {
            System.out.println("You cannot travel in that direction.");
        }
        return rooms;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Puzzle> getPuzzles() {
        return puzzles;
    }
}

//    public boolean validDirection(int currentRoomNumber, String direction) {
//        int index = currentRoomNumber - 1;
//        boolean result = false;
//
//        switch (direction.toLowerCase()) {
//            case "n":
//                if (rooms.get(index).getNorthside() != 0) {
//                    result = true;
//                }
//                break;
//
//            case "s":
//                if (rooms.get(index).getSouthside() != 0) {
//                    result = true;
//                }
//                break;
//
//            case "e":
//                if (rooms.get(index).getEastside() != 0) {
//                    result = true;
//                }
//                break;
//
//            case "w":
//                if (rooms.get(index).getWestside() != 0) {
//                    result = true;
//                }
//                break;
//
//            default:
//                break;
//        }
//        return result;
//    }
//}
