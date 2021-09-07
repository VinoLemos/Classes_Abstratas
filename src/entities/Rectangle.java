package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	private Double widht, height;
	
	public Rectangle() {
		super();
	}
	


	public Rectangle(Color color, Double widht, Double height) {
		super(color);//Enum passado para a super classe.
		this.widht = widht;
		this.height = height;
	}



	public Double getWidht() {
		return widht;
	}



	public void setWidht(Double widht) {
		this.widht = widht;
	}



	public Double getHeight() {
		return height;
	}



	public void setHeight(Double height) {
		this.height = height;
	}



	// O método area() é um metodo abstrato, de uma classe também abstrata. Para que a classe Rectangle possa herdar este 
// método, é preciso adicionar a anotaçao @Override, e sobescrever o método original.
	@Override
	public double area() {
		return widht * height;
	}

}
