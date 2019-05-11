package entities;

import characters.Monster;
import gameplay.Inventory;

/**
 * Created by Machenike on 2019/5/11.
 */
public class Room extends Entity {
    private Monster monster;
    Inventory pickupsInRoom;
    Room[] connectingRooms;
    boolean finalRoom;

    public Room() {
    }

    public Room(String description, Inventory pickupsInRoom,
                Room[] connectingRooms) {
        this.description = description;
        this.pickupsInRoom = pickupsInRoom;
        this.connectingRooms = connectingRooms;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Inventory getPickupsInRoom() {
        return pickupsInRoom;
    }

    public void setPickupsInRoom(Inventory pickupsInRoom) {
        this.pickupsInRoom = pickupsInRoom;
    }

    public Room[] getConnectingRooms() {
        return connectingRooms;
    }

    public void setConnectingRooms(Room[] connectingRooms) {
        this.connectingRooms = connectingRooms;
    }

    public boolean isFinalRoom() {
        return finalRoom;
    }

    public void setFinalRoom(boolean finalRoom) {
        this.finalRoom = finalRoom;
    }
}
