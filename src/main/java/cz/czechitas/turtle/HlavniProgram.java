package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        zofka.penUp();
        triangl(100, Color.yellow);
        rectangle(200,150, Color.BLACK);
        square(250, Color.BLUE);
        wheel(100, Color.DARK_GRAY);
        rightTriangle(300, Color.cyan);
    }

    public void triangl (double sideLenght, Color lineColor) {
        zofka.setPenColor(lineColor);
        zofka.turnLeft(180);
        zofka.move(sideLenght/2);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(sideLenght/2);
        zofka.turnRight(120);
        zofka.move(sideLenght);
        zofka.turnRight(120);
        zofka.move(sideLenght);
        zofka.turnRight(120);
        zofka.move(sideLenght/2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(sideLenght/2);
    }

    public void rectangle (double sideLengthA, double sideLengthB, Color lineColor) {
        zofka.setPenColor(lineColor);
        zofka.turnRight(180);
        zofka.move(sideLengthB/2);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(sideLengthA/2);
        zofka.turnRight(90);
        zofka.move(sideLengthB);
        zofka.turnRight(90);
        zofka.move(sideLengthA);
        zofka.turnRight(90);
        zofka.move(sideLengthB);
        zofka.turnRight(90);
        zofka.move(sideLengthA/2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(sideLengthB/2);
    }

    public void square(double sideLength, Color lineColor) {
        zofka.setPenColor(lineColor);
        zofka.turnRight(180);
        zofka.move(sideLength/2);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(sideLength/2);
        zofka.turnRight(90);
        zofka.move(sideLength);
        zofka.turnRight(90);
        zofka.move(sideLength);
        zofka.turnRight(90);
        zofka.move(sideLength);
        zofka.turnRight(90);
        zofka.move(sideLength/2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(sideLength/2);
    }

    public void wheel (double radius, Color lineColor) {
        zofka.setPenColor(lineColor);
        zofka.turnRight(180);
        zofka.move(radius);
        zofka.penDown();
        zofka.turnRight(90);
        for (int i = 0; i < 360/10; i++) {
            zofka.move(radius/10);
            zofka.turnRight(radius/10);
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(radius);

    }

    public void rightTriangle(double sideLength, Color lineColor) {
        zofka.setPenColor(lineColor);
        var lengthOfHypotenuse = Math.sqrt(2*Math.pow(sideLength, 2));
        zofka.turnRight(180);
        zofka.move(sideLength/2);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(sideLength/2);
        zofka.turnRight(90);
        zofka.move(sideLength);
        zofka.turnRight(135);
        zofka.move(lengthOfHypotenuse);
        zofka.turnRight(135);
        zofka.move(sideLength/2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(sideLength/2);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
