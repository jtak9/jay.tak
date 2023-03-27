package org.example;

import java.util.ArrayList;

public class Room {
    private String roomNumber;
    private String roomName;
    private String roomDesc;
    private boolean familiar;
    private String northside;
    private String southside;
    private String eastside;
    private String westside;
    private ArrayList<String> items;
    private String pzlID;


    public Room(String roomNumber, String roomName, String roomDesc, boolean familiar,
                String northside, String southside, String eastside, String westside,
                String items, String pzlID) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomDesc = roomDesc;
        this.familiar = familiar;
        this.northside = northside;
        this.southside = southside;
        this.eastside = eastside;
        this.westside = westside;
        this.items = new ArrayList<>();
        this.pzlID = pzlID;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    public String getNorthside() {
        return northside;
    }

    public String getSouthside() {
        return southside;
    }

    public String getEastside() {
        return eastside;
    }

    public String getWestside() {
        return westside;
    }

    public ArrayList<String> getItems() { return items; }

    public void addItems(String items) { this.items.add(items); }

    public String getPzlID() { return pzlID; }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomDesc='" + roomDesc + '\'' +
                ", familiar=" + familiar +
                ", northside='" + northside + '\'' +
                ", southside='" + southside + '\'' +
                ", eastside='" + eastside + '\'' +
                ", westside='" + westside + '\'' +
                ", items='" + items + '\'' +
                ", pzlID='" + pzlID + '\'' +
                '}';
    }
}

