package gameplay;

import characters.Monster;
import characters.Player;
import entities.Room;

import java.util.Scanner;

public class World
{
	public enum PlayMode {battle,explore;}

	World(Room room) {
		this.currentRoom = room;
	}

	private Player player;
	private boolean gameInProgress = true;
	private PlayMode mode;
	private Room currentRoom;
	
	
	//--------------------------------------------------------	
	private void play(Player player)
	{
		this.player=player;
		System.out.println("Welcome player "+player.getName());

		System.out.println(player);
		System.out.println("total room size : " + this.currentRoom.getConnectingRooms().length);
		this.onEnterRoom();

		while(gameInProgress)
		{
			switch(this.mode)
			{
			case explore:
				processExploreUserInput();
				break;
			case battle:
				processBattleUserInput();             
				break;
			}

		}
	}
	//--------------------------------------------------------	
	private void onEnterRoom()
	{
		System.out.println(currentRoom.getDescription());
		Monster monster = this.currentRoom.getMonster();
		if (monster != null) {
			boolean appears = monster.appears();
			if (appears) {
				System.out.println("A " + monster + " draws hither!");
				readyBattleMode();
			} else {
				readyExploreMode();
			}
		} else {
			readyExploreMode();
		}
	}
	//--------------------------------------------------------

	private void processExploreUserInput() {
		if (this.currentRoom.getPickupsInRoom() == null || this.currentRoom.getPickupsInRoom().getItems() == null
				|| this.currentRoom.getPickupsInRoom().getItems().length <= 0) {
			System.out.println("这是一间空房间");
		}
		this.gameInProgress = true;
	}

	private void processBattleUserInput() {
		this.gameInProgress = true;
	}

	private void readyBattleMode() {
		this.mode = PlayMode.battle;
	}

	private void readyExploreMode() {
		this.mode = PlayMode.explore;
	}

	/**
	 * get what player typed
	 * @return
	 */
	private String inputFromPlayer() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public static void main(String[] args) 
	{
		World world = ReadWorldDataFile.simpleWorld();
		Player playerOne = new Player("Sir Kendric","Shiny Armour",100,50);
		world.play(playerOne);		
	}
	//--------------------------------------------------------
}
