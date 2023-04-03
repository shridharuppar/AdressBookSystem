package com.bridgelabz.adressbooksystem;

public class Contacts {
	 public String FirstName, LastName,Adress,City,State,Email;
	    public int zip;
	    public long  PhoneNumber;
	    
	    public Contacts (String FirstName,String LastName, String Adress,String City, String State, String Email, int zip, long PhoneNumber ) {
	     
	    this.FirstName = FirstName;
	    this.LastName = LastName;
	    this.Adress = Adress;
	    this.City = City;
	    this.State = State;
	    this.Email = Email;
	    this.zip= zip;
	    this.PhoneNumber=PhoneNumber;
	    }
	     public Contacts() {
			// TODO Auto-generated constructor stub
		}
		public  String getFirstName() {
	    	 return FirstName;
	     }
	     public  void setFirstName(String FirstName ) {
	    	 this.FirstName=FirstName; 
	    		 
	    	 }
	    	
	        public String getlastName() {
	    		 return LastName;
	    	 }
	    	
	        public void setLastName(String LastName) {
	    		 this.LastName=LastName;
	    	 }
	    	
	          public String getadress() {
	    		 return Adress;
	    	 }
	    	
	          public void setAdress(String Adress) {
	    				 this.Adress=Adress;
	         }
	    		
	    	 public String getCity() {
	    			return City;
	    		}
	    			
	    		public void setCity(String City) {
	    				 this.City=City;
	    			 }
	    			
	    			 public String getState() {
	    				 return State;
	    			 }
	    			
	    			 public void setState(String State) {
	    				 this.State=State;
	    			 }
	    			
	    			 public String getEmail() {
	    				 return Email;
	    			 }
	    			
	    			 public void setEmail(String Email) {
	    				 this.Email=Email;
	    			 }
	    			 public int getZip() {
	    					return zip;
	    				}

	    				public void setZip(int zip) {
	    					this.zip = zip;
	    				}

	    				public long getPhoneNumber() {
	    					return PhoneNumber;
	    				}

	    				public void setPhoneNumber(long phoneNumber) {

	    					this.PhoneNumber = phoneNumber;
	    				}
	    			}

