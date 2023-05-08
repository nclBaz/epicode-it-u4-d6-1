package app;

import javax.naming.InvalidNameException;

import exceptions.NumberLessThanZeroException;

public class Rectangle {
	private int x, y;
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setName(String name) throws InvalidNameException {
		if (name.length() < 4) {
			throw new InvalidNameException(name + " è troppo corto. Lunghezza minima 4 caratteri");
		} else {
			this.name = name;
		}
	}

	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int getArea() {
		if (this.x < 0) {
			throw new NumberLessThanZeroException("x è <0", x);
		}

		if (this.y < 0) {
			throw new NumberLessThanZeroException("y è <0", y);

		}

		return this.x * this.y;
	}

	public int calc() {
		return this.getArea();
	}

}
