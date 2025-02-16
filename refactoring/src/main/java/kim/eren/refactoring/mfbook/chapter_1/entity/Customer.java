package kim.eren.refactoring.mfbook.chapter_1.entity;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector rentalList = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		this.rentalList.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = rentalList.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();

			// determine amounts for each line
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;

			}
			// add frequent renter points frequentRenterPoints ++; // add bonus for a two
			// day new release rental if ((each.getMovie().getPriceCode() ==
			// Movie.NEW_RELEASE) && each.getDaysRented() > 1) frequentRenterPoints ++;

			// show figures for this rental result += "\t" + each.getMovie().getTitle()+
			// "\t" + String.valueOf(thisAmount) + "\n"; totalAmount += thisAmount;

		} // add footer lines result += "Amount owed is " + String.valueOf(totalAmount) +
			// "\n"; result += "You earned " + String.valueOf(frequentRenterPoints) + "
			// frequent renter points";
		return result;
	}

}
