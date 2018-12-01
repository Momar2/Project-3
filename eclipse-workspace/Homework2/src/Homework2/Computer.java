package Homework2;

public class Computer {
int price;
public static String color;
    String brand;
public static int year;
public Computer() {
}
public Computer(int price, int year) {
	this.price= price;
	this.year = year;
}
public Computer (String color, String brand) {
	this.color= color;
	this.brand= brand;
}
public void displayComputerBrand() {
System.out.println("The brand of the Computer is MacPro Book");
}
public int showComputerPrice() {
	return price;
}
public static void getComputerColor( ) {
	System.out.println("Your computer color is");
}
public static int displayComputerYear( ) {
	return year;
}
}

