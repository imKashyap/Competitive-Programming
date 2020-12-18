package myPrograms.oops;

import java.util.LinkedList;
import java.util.Scanner;

public class IFCSManager {
	static LinkedList<Equipment> equipments = new LinkedList<>();

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add Equipment");
			System.out.println("2. Remove Equipment");
			System.out.println("3. Report Equipment");
			System.out.println("4. Display Equipments");
			System.out.println("5. Exit");
			System.out.println("Enter Choice: ");
			int ch = scr.nextInt();
			String id, desc;
			if (ch == 5)
				break;
			switch (ch) {
			case 1:
				id = scr.next();
				scr.nextLine();
				desc = scr.nextLine();
				if (id == null)
					System.out.println("Error - id cannot be null");
				else if (desc == null)
					System.out.println("Error - description cannot be null");
				else {
					Equipment eq = new Equipment(id, desc);
					addEquipment(eq);
				}
				break;
			case 2:
				id = scr.next();
				if (id == null)
					System.out.println("Error - id cannot be null");
				else
					removeEquipment(id);
				break;
			case 3:
				id = scr.next();
				if (id == null)
					System.out.println("Error - id cannot be null");
				else
					reportEquipment(id);
				break;
			case 4:
				displayEquipments();
				break;

			default:
				System.out.println("Invalid Input");

			}

		}
		scr.close();
	}

	static void addEquipment(Equipment eq) {
		if (equipments.isEmpty())
			equipments.add(eq);
		else {
			if (Integer.valueOf(equipments.getLast().id) < Integer.valueOf(eq.id))
				equipments.add(eq);
			else {
				for (int i = 0; i < equipments.size(); i++) {
					if (Integer.valueOf(equipments.get(i).id) > Integer.valueOf(eq.id)) {
						equipments.add(0, eq);
						break;
					}
				}
			}
		}
	}

	static void removeEquipment(String id) {
		int i;
		for (i = 0; i < equipments.size(); i++) {
			if (equipments.get(i).id.equalsIgnoreCase(id)) {
				equipments.remove(i);
				System.out.println("Equipment removed from Lab");
				break;
			}
		}
		if (i == equipments.size())
			System.out.println("Equipment with id " + id + " cannot be found.");
	}

	static void reportEquipment(String id) {
		int i;
		for (i = 0; i < equipments.size(); i++) {
			if (equipments.get(i).id.equalsIgnoreCase(id)) {
				System.out.println("Equipment available in Lab");
				break;
			}
		}
		if (i == equipments.size())
			System.out.println("Equipment not in lab.");

	}

	static void displayEquipments() {
		for (int i = 0; i < equipments.size(); i++) {
			Equipment eq = equipments.get(i);
			System.out.println("id=" + eq.id + ", desc=" + eq.description);
		}
	}

}
