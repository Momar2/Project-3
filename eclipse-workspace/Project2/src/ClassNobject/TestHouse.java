package ClassNobject;

public class TestHouse {

	public static void main(String[] args) {
	House myHouse = new House();
	myHouse.NumberOfBedRoom();
	String houseName = myHouse.getHouseName();
	System.out.println(houseName);
	
	House yourHouse = new House();
	yourHouse.NumberOfBedRoom();
	
	Office myOffice = new Office();
	myOffice.displayOfficeAddress();
	
	
	
			
	}

}
