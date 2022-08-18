package entities;

import java.time.LocalDate;

public class GameProduct {
	private String nameofGame;
	private double price;
	private LocalDate yearOfGame;

	public GameProduct(String nameofGame, double price, LocalDate yearOfGame) {
		super();
		this.nameofGame = nameofGame;
		this.price = price;
		this.yearOfGame = yearOfGame;
	}

	public String getNameofGame() {
		return nameofGame;
	}

	public void setNameofGame(String nameofGame) {
		this.nameofGame = nameofGame;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getYearOfGame() {
		return yearOfGame;
	}

	public void setYearOfGame(LocalDate yearOfGame) {
		this.yearOfGame = yearOfGame;
	}

}
