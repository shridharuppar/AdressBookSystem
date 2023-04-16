package com.bridgelabz.adressbooksystem;

public class addressBooks {
	public static void main(String[] args) {
		AddressBookSystem addressBook = new AddressBookSystem();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 to add contact");
			System.out.println("Enter 2 to display all contacts");
			System.out.println("Enter 3 to edit a contact");
			System.out.println("Enter 4 to delete a contact");
			System.out.println("Enter 5 to Quit");
			System.out.println("Enter 1 to add Address Book");
			System.out.println("Enter 2 to display Address Book");
			System.out.println("Enter 3 to display Address Book");
			System.out.println("Enter 4 to add contact");
			System.out.println("Enter 5 to display all contacts");
			System.out.println("Enter 6 to edit a contact");
			System.out.println("Enter 7 to delete a contact");
			System.out.println("Enter 8 to display Address Book");
			System.out.println("Enter 0 to exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
@@ -23,31 +26,39 @@ public static void main(String[] args) {
				System.out.println("Exiting Address Book");
				System.exit(0);
			case 1:
				addressBook.addContacts();
				addressBook.addAddressBook();
				break;
			case 2:
				addressBook.displayContacts();
				addressBook.displayAddressBooks();
				break;
			case 3:
				addressBook.openAddressBook();
				break;
			case 4:
				addressBook.addContacts();
				break;
			case 5:
				addressBook.displayContacts();
				break;
			case 6:
				System.out.println("Enter the first name of the contact to edit:");
				String firstName = scanner.nextLine();
				System.out.println("Enter the last name of the contact to edit:");
				String lastName = scanner.nextLine();
				addressBook.editContact(firstName, lastName);
				break;
			case 4:
			case 7:
				System.out.println("Enter the first name of the contact to delete:");
				String firstName1 = scanner.nextLine();
				System.out.println("Enter the last name of the contact to delete:");
				String lastName1 = scanner.nextLine();
				addressBook.deleteContact(firstName1, lastName1);
				break;
			case 5:
			case 8:
				System.exit(0);
			default:
				System.out.println(" Contact details not found. ");
			}
		}
	}


}
