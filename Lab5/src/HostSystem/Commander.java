package HostSystem;

import FlatManager.Flat;

import java.util.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Commander {

	private final CollectionManager collectionManager;

	private String userCommand;

	private String[] finalUserCommand;

	{
		userCommand = "";
	}

	public Commander(CollectionManager manager){
		this.collectionManager = manager;
	}


	public void interactiveMod() {
		try {
			try(Scanner commandReader = new Scanner(System.in)){
				while (!userCommand.equals("exit")){

					System.out.print("Enter a command: ");
					userCommand = commandReader.nextLine();
					finalUserCommand = userCommand.trim().toLowerCase().split(" ", 2);
					try{
						switch(finalUserCommand[0]){
							case "":
								break;
							case "help":
								collectionManager.help();
								break;

							case "info":
								collectionManager.info();
								break;

							case "show":
								collectionManager.show();
								break;

							case "add":
								collectionManager.add();
								break;

							case "update_id":
								collectionManager.update_id(finalUserCommand[1]);
								break;

							case "remove_by_id":
								collectionManager.remove_id(finalUserCommand[1]);
								break;

							case "clear":
								collectionManager.clear();
								break;

							case "save":
								collectionManager.save();
								break;
							
							case "executive_script":
								collectionManager.executive_script(finalUserCommand[1]);
								break;

							case "exit":
								collectionManager.exit();
								break;

							case "add_if_max":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.add_if_max(new Flat(collectionManager.receiveId(), collectionManager.receiveName(), collectionManager.receiveCoordinates(), collectionManager.receiveCreationDate(), collectionManager.receiveArea(), collectionManager.receiveNumberOfRooms(), collectionManager.receiveNew(), collectionManager.receiveFurnish(), collectionManager.receiveView(), collectionManager.receiveHouse()));
								break;

							case "add_if_min":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.add_if_min(new Flat(collectionManager.receiveId(), collectionManager.receiveName(), collectionManager.receiveCoordinates(), collectionManager.receiveCreationDate(), collectionManager.receiveArea(), collectionManager.receiveNumberOfRooms(), collectionManager.receiveNew(), collectionManager.receiveFurnish(), collectionManager.receiveView(), collectionManager.receiveHouse()));
								break;

							case "remove_greater":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.remove_greater(collectionManager.receiveArea());
								break;
							
							case "remove_any_by_number_of_rooms":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.remove_any_by_number_of_rooms(collectionManager.receiveNumberOfRooms());
								break;

							case "max_by_furnish":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.max_by_furnish();
								break;

							case "group_counting_by_id":
								System.out.println("Enter characteristics of element, which will be compared with elements in collection.");
								collectionManager.group_counting_by_id();
								break;
						}
					} catch(ArrayIndexOutOfBoundsException ex){
						System.out.println("Argument of command is absent. Write help for help");
					} catch (ParserConfigurationException e) {
						e.printStackTrace();
					} catch (TransformerException e) {
						e.printStackTrace();
					}	
				}
			}	
		}catch(NoSuchElementException noSuchElementException){
			System.out.println("Program will be finished now.");
			System.exit(1);	
		}
	}
}

