package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    private Player player;

    public static void main(String[] args) {
        Game play = new Game();
        play.startGame();
        play.input.close();
    }

    private void startGame() {
        try {
            player = new Player();
            printRoomInfo();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            System.exit(0);
        }

        while (true) {
            readCommands();
        }
    }

    private void readCommands() {
        System.out.println("Which direction would you like to travel? (N, S, E, W) " +
                "or type 'exit' to quit the game.");
        String command = input.nextLine();

        if (command.equalsIgnoreCase("N")) {
            player.travelNorth();
            printRoomInfo();
        }
        else if (command.equalsIgnoreCase("S")) {
            player.travelSouth();
            printRoomInfo();
        }
        else if (command.equalsIgnoreCase("E")) {
            player.travelEast();
            printRoomInfo();
        }
        else if (command.equalsIgnoreCase("W")) {
            player.travelWest();
            printRoomInfo();
        }
        else if (command.equalsIgnoreCase("Inventory")) {
            System.out.println(player.getInventory());
        }
        else if (command.contains("pickup")) {
            System.out.println(player.getPickupItem());
        }
        else if (command.contains("drop")) {
            System.out.println(player.getDroppedItem());
        }
        else if (command.contains("inspect")) {
            System.out.println(player.getInspectItem());
        }
    }

    private void printRoomInfo() {
        if (player.isRoomFamiliar() == true) {
            System.out.println("This room looks familiar.");
        }
        else if (!player.getCurrentRoomPzlID().equals("0")) {
            player.puzzleFinder();
        }
        else if (!player.getCurrentRoomItems().equals("0")) {
            player.itemFinder();
        }
        else {
            System.out.println("You are in Room " + player.getCurrentRoomNumber()
                    + ": " + player.getCurrentRoomName());
            System.out.println(player.getCurrentRoomDesc());
        }
    }
}

//    private static final Scanner input = new Scanner(System.in);
//    private static Map map;
//
//    private static final String ANSI_RESET = "\u001B[0m";
//
//    private static final String ANSI_BLUE = "\u001B[34m";
//
//    private static final String ANSI_RED = "\u001B[31m";
//
//    public static void main(String[] args) {
//        start();
//    }
//
//    private static void start() {
//        map = new Map();
//        play(1);
//    }
//
//    public static void play(int startRoom) {
//        int currentRoom = startRoom;
//        ArrayList<Room> currentRooms = map.getRooms();
//
//        while (true) {
//            int index = currentRoom - 1;
//
//            if (currentRooms.get(index).isFamiliar()) {
//                System.out.println(ANSI_BLUE + "This looks familiar..." + ANSI_RESET);
//            }
//
//            System.out.println("You are in Room " + currentRooms.get(index).getRoomNumber()
//                    + ": " + currentRooms.get(index).getRoomName()
//                    + "\n" + currentRooms.get(index).getRoomDesc());
//
//            System.out.println();
//
//            while (true) {
//                System.out.println("Which direction would you like to travel? (N, S, E, W) or type 'exit' to quit game");
//                String direction = input.nextLine().toLowerCase();
//
//                switch (direction) {
//                    case "n":
//                        if (map.validDirection(currentRoom, "n")) {
//                            currentRooms.get(index).setFamiliar();
//                            currentRoom = currentRooms.get(index).getNorthside();
//                        }
//                        else {
//                            System.out.println(ANSI_RED + "Sorry, you cannot travel that way" + ANSI_RESET);
//                        }
//
//                        break;
//
//                    case "s":
//                        if (map.validDirection(currentRoom, "s")) {
//                            currentRooms.get(index).setFamiliar();
//                            currentRoom = currentRooms.get(index).getSouthside();
//                        }
//                        else {
//                            System.out.println(ANSI_RED + "Sorry, you cannot travel that way" + ANSI_RESET);
//                        }
//
//                        break;
//
//                    case "e":
//                        if (map.validDirection(currentRoom, "e")) {
//                            currentRooms.get(index).setFamiliar();
//                            currentRoom = currentRooms.get(index).getEastside();
//                        }
//                        else {
//                            System.out.println(ANSI_RED + "Sorry, you cannot travel that way" + ANSI_RESET);
//                        }
//
//                        break;
//
//                    case "w":
//                        if (map.validDirection(currentRoom, "w")) {
//                            currentRooms.get(index).setFamiliar();
//                            currentRoom = currentRooms.get(index).getWestside();
//                        }
//                        else {
//                            System.out.println(ANSI_RED + "Sorry, you cannot travel that way" + ANSI_RESET);
//                        }
//
//                        break;
//
//                    case "exit":
//                        System.out.println("Quitting game...");
//                        System.exit(0);
//
//                    default:
//                        System.out.println(ANSI_RED + "That was not a valid input. Please try again." + ANSI_RESET);
//                        System.out.println();
//                }
//                break;
//            }
//        }
//    }
//}

