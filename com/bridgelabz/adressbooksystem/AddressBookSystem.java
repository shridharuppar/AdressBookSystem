Contacts contacts = new Contacts();
	Scanner scanner = new Scanner(System.in);
	List<Contacts> Contacts = new ArrayList<Contacts>();

	public void addContacts() {

		System.out.println("Enter First Name : ");
		String firstName = scanner.nextLine();
		contacts.setFirstName(firstName);

		System.out.println("Enter Last Name : ");
		String lastName = scanner.nextLine();
		contacts.setLastName(lastName);

		System.out.println("Enter Address :");
		String address = scanner.nextLine();
		contacts.setAddress(address);

		System.out.println("Enter City : ");
		String city = scanner.nextLine();
		contacts.setCity(city);

		System.out.println("Enter State : ");
		String state = scanner.nextLine();
		contacts.setState(state);

		System.out.println("Enter Email : ");
		String email = scanner.nextLine();
		contacts.setEmail(email);

		System.out.println("Enter ZIP : ");
		int zip = scanner.nextInt();
		contacts.setZip(zip);

		System.out.println("Enter Phone Number");
		long phoneNumber = scanner.nextLong();
		contacts.setPhoneNumber(phoneNumber);

		Contacts.add(contacts);
		System.out.println("Person Information has created sucessfully");

		boolean addingContacts = true;
		while (addingContacts) {
			Contacts contacts = new Contacts();
			System.out.println("Enter First Name : ");
			String firstName = scanner.nextLine();
			contacts.setFirstName(firstName);

			System.out.println("Enter Last Name : ");
			String lastName = scanner.nextLine();
			contacts.setLastName(lastName);

			System.out.println("Enter Address :");
			String address = scanner.nextLine();
			contacts.setAddress(address);

			System.out.println("Enter City : ");
			String city = scanner.nextLine();
			contacts.setCity(city);

			System.out.println("Enter State : ");
			String state = scanner.nextLine();
			contacts.setState(state);

			System.out.println("Enter Email : ");
			String email = scanner.nextLine();
			contacts.setEmail(email);

			System.out.println("Enter ZIP : ");
			int zip = scanner.nextInt();
			scanner.nextLine(); // consume the newline character
			contacts.setZip(zip);

			System.out.println("Enter Phone Number");
			long phoneNumber = scanner.nextLong();
			scanner.nextLine(); // consume the newline character
			contacts.setPhoneNumber(phoneNumber);

			Contacts.add(contacts);
			System.out.println("Person Information has been added successfully");
			System.out.println("Do you want to add another person? (Y/N)");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("N")) {
				addingContacts = false;
			}
		}
	}

	public void displayContacts() {
@@ -113,21 +122,21 @@ public void editContact(String firstName, String lastName) {
	}

	public void deleteContact(String firstName, String lastName) {
	    int index = -1;
	    for (int i = 0; i < Contacts.size(); i++) {
	        Contacts contact = Contacts.get(i);
	        if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
	            index = i;
	            break;
	        }
	    }

	    if (index >= 0) {
	        Contacts.remove(index);
	        System.out.println("Person deleted successfully.");
	    } else {
	        System.out.println("Person not found.");
	    }
		int index = -1;
		for (int i = 0; i < Contacts.size(); i++) {
			Contacts contact = Contacts.get(i);
			if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			Contacts.remove(index);
			System.out.println("Person contact deleted successfully.");
		} else {
			System.out.println("Person contact not found.");
		}
	
}
