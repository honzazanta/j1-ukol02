package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        zofka.penUp();
        icecream();
        zofka.move(250);
        snowman();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnLeft(180);
        train();
        // icecream();
        // snowman();
        //zofka.move(50);
        //zofka.turnRight(180);
        //isoscelesTriangle(300, Color.yellow);
        // rectangle(200,150, Color.BLACK);
        // square(250, Color.BLUE);
        //zofka.move(50);
        //wheel(300, Color.DARK_GRAY);
        // rightTriangle(300, Color.cyan);
    }

    public void train() {
        rectangle(200,100, Color.blue);
        zofka.penUp();
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(150);
        rectangle(200,100,Color.black);
        zofka.turnRight(90);
        zofka.move(65);
        zofka.turnRight(180);
        wheel(30,12,Color.red);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(130);
        wheel(30,5, Color.BLUE);
        zofka.turnLeft(90);
        zofka.move(80);
        wheel(30,5,Color.pink);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(270);
        triangl(80,Color.pink);
    }
    public void snowman() {
        wheel(30, 15, Color.blue);
        zofka.turnRight(100);
        wheel(30, 10, Color.black);
        zofka.turnRight(75);
        zofka.move(100);
        zofka.turnRight(200);
        wheel(30, 5, Color.yellow);
        zofka.turnLeft(110);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        wheel(30,3, Color.DARK_GRAY);
        zofka.turnLeft(80);
        zofka.move(105);
        zofka.turnLeft(180);
        wheel(30,3,Color.DARK_GRAY);
    }

    public void icecream() {
        zofka.move(50);
        zofka.turnRight(180);
        isoscelesTriangle(300, Color.yellow);
        zofka.move(50);
        wheel(30, 20, Color.DARK_GRAY);
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

    public void wheel (int pocetStran, double delkaStrany, Color lineColor) {
        zofka.setPenColor(lineColor);
        zofka.penDown();
        zofka.turnRight(90);
        double uhel = 360d / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
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
