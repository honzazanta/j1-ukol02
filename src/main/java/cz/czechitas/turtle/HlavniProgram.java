package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        zofka.penUp();
        icecream();
        //zofka.move(50);
        //zofka.turnRight(180);
        //isoscelesTriangle(300, Color.yellow);
        // rectangle(200,150, Color.BLACK);
        // square(250, Color.BLUE);
        //zofka.move(50);
        //wheel(300, Color.DARK_GRAY);
        // rightTriangle(300, Color.cyan);
    }

    public void icecream() {
        zofka.move(50);
        zofka.turnRight(180);
        isoscelesTriangle(300, Color.yellow);
        zofka.move(50);
        wheel(300, Color.DARK_GRAY);
    }
    public void isoscelesTriangle (double sideLength, Color lineColor){
        zofka.setPenColor(lineColor);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(sideLength/3);
        zofka.turnRight(110);
        zofka.move(sideLength);
        zofka.turnRight(140);
        zofka.move(sideLength);
        zofka.turnRight(110);
        zofka.move(sideLength/3);
        zofka.penUp();
        zofka.turnRight(90);
    }
    public void triangl (double sideLenght, Color lineColor) {
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
        zofka.penDown();
        zofka.turnRight(90);
        for (int i = 0; i < radius/2; i++) {
            zofka.move(radius/70);
            zofka.turnRight(radius/125);
        }
        zofka.penUp();
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
