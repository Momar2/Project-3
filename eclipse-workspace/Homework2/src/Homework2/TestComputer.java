package Homework2;

public class TestComputer {

	public static void main(String[] args) {
	
	Computer myComputer = new Computer("3000", "2018");
	Computer yourComputer = new Computer("Black"," Mac");
	
	myComputer.displayComputerBrand();
	myComputer.showComputerPrice();
	myComputer.getComputerColor();
	myComputer.displayComputerBrand();
	
	Computer.getComputerColor();
	Computer.displayComputerYear();
	
	System.out.println ("My Computer price is :" +myComputer.price);
	System.out.println("Your computer color is:" +myComputer.color);
	System.out.println("My computer year is:" +myComputer.year);
	System.out.println("Your computer brand is:" +myComputer.brand);

	}

}
