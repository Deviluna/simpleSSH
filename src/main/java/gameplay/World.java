package gameplay;

import characters.Monster;
import characters.Player;
import com.google.common.base.Joiner;
import entities.Room;
import food.Food;
import pickups.Pickup;
import pickups.Wieldable;
import valuables.Valuable;

import java.util.Scanner;

public class World
{
	public enum PlayMode {battle,explore;}

	public enum InputWord {
		admire, describe, door, eat, exit, help, mobile, open, pickup, quit, stats, wield;
		public static InputWord fromInput(String line) {
			line = line.trim().toLowerCase().split(" ")[0];
			return InputWord.valueOf(line);
		}
	}

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

	/**
	 * explore the room and do what player typed
	 */
	private void processExploreUserInput() {
		String playerInput = inputFromPlayer();
		calPlayerInput(playerInput);
		this.gameInProgress = true;
	}

	/**
	 * fight with monster
	 */
	private void processBattleUserInput() {
		System.out.println(this.player.getName() + " fight with " + this.currentRoom.getMonster().getId());
		int index = 0;
		do {
			if (this.player.getHealth() <= 0) {
				System.out.println(this.player.getName() + " was beaten by " + this.currentRoom.getMonster().getId());
				System.out.println("you losed!!");
				this.gameInProgress = false;
				return;
			}
			if (this.currentRoom.getMonster().getHealth() <= 0) {
				System.out.println(this.player.getName() + " fight against " + this.currentRoom.getMonster().getId() + " and win");
				this.currentRoom.setMonster(null);
				this.gameInProgress = true;
				if (this.currentRoom.getPickupsInRoom().getItems() != null && this.currentRoom.getPickupsInRoom().getItems().length > 0) {
					System.out.println("there are something else in this room, change room mode");
					this.readyExploreMode();
				}
				return;
			}
			if (index % 2 == 0) {
				this.currentRoom.getMonster().defendAttack(this.player);
			} else {
				this.player.defendAttack(this.currentRoom.getMonster());
			}
			index++;
		} while (true);
	}

	/**
	 * change room mode
	 */
	private void readyBattleMode() {
		this.mode = PlayMode.battle;
	}

	private void readyExploreMode() {
		this.mode = PlayMode.explore;
	}

	/**
	 * do what player type in
	 * @param input
	 */
	private void calPlayerInput(String input) {
		InputWord wordType = InputWord.fromInput(input);
		Pickup pickup = null;
		switch (wordType) {
			case admire:
				pickup = this.currentRoom.getPickupsInRoom().select(input.trim().toLowerCase().split(" ")[1]);
				int confidence = ((Valuable) pickup).getValue();
				this.player.setConfidence(this.player.getConfidence() + confidence);
				System.out.println(this.player.getName() + " admires " + pickup.getId());
				System.out.println(this.player.getName() + " confidence increases " + confidence);
				break;
			case describe:
				this.currentRoom.describe();
				break;
			case door:
				int doorNum = Integer.parseInt(input.trim().toLowerCase().split(" ")[1]);
				System.out.println(this.player.getName() + " bravely opens door " + doorNum);
				this.currentRoom = this.currentRoom.getConnectingRooms()[doorNum - 1];
				this.onEnterRoom();
				break;
			case eat:
				pickup = this.currentRoom.getPickupsInRoom().select(input.trim().toLowerCase().split(" ")[1]);
				this.player.setHealth(this.player.getHealth() + ((Food) pickup).getHealth());
				// remove player`s food what just eated
				this.player.getInventory().remove(pickup);
				System.out.println(this.player.getName() + " ate the " + pickup.getId() + " increasing his health " + ((Food) pickup).getHealth());
				break;
			case exit:
				System.out.println(player.getName()  + "searched everywhere for the exit....\n" +
						"     ...and behold, found it.");
				System.out.println("Well done brave Sir Kendric.\n" +
						"Your quest has now ended.");
				break;
			case help:
				InputWord[] words = InputWord.values();
				System.out.println("Explore commands: " + Joiner.on(",").join(words));
				break;
			case mobile:
				break;
			case open:
				break;
			case pickup:
				pickup = this.currentRoom.getPickupsInRoom().select(input.trim().toLowerCase().split(" ")[1]);
				this.player.getInventory().add(pickup);
				this.currentRoom.getPickupsInRoom().remove(pickup);
				System.out.println(this.player + " picks up the " + pickup.getId());
				break;
			case quit:
				break;
			case stats:
				this.player.stats();
				break;
			case wield:
				pickup = this.currentRoom.getPickupsInRoom().select(input.trim().toLowerCase().split(" ")[1]);
				this.player.setWeapon((Wieldable) pickup);
				System.out.println(this.player + " wields the" + pickup.getId());
				break;
			default:
				words = InputWord.values();
				System.out.println("Explore commands: " + Joiner.on(",").join(words));
				break;
		}
	}

	/**
	 * get what player typed
	 * @return
	 */
	private String inputFromPlayer() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static void main(String[] args) 
	{
		World world = ReadWorldDataFile.simpleWorld();
		Player playerOne = new Player("Sir Kendric","Shiny Armour",100,50);
		world.play(playerOne);		
	}
	//--------------------------------------------------------
}
