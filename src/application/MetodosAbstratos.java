package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
// Lista criada para armazenar objetos "shapes" do tipo "Shape"		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
//Variável representando a quantidade de formas 		
		int n = sc.nextInt();
// Recebe os dados das formas 		
		for (int i = 0; i < n; i++) {
			System.out.print("Rectangle or circle? (c/r)");
			char ch = sc.next().charAt(0);
			System.out.print("Shape color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());//Palavar que o usuário digitar será convertida para o tipo enumerado
			
			switch (ch) {
			case 'c':
				System.out.print("Enter circle radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
				break;
			case 'r':
				System.out.print("Enter rectangle height: ");
				double height = sc.nextDouble();
				System.out.print("Enter rectangle widht: ");
				double widht = sc.nextDouble();
				shapes.add(new Rectangle(color, height, widht));
				break;
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Shape areas: ");
		
		for(Shape sh : shapes) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		sc.close();
	}

}
