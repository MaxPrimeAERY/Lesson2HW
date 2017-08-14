/**
 * Created by Maximus on 10.08.2017.
 */
public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    private double lineAB;
    private double lineBC;
    private double lineCD;
    private double lineDA;
    private double lineAC;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }


    public double getPerimetr() {
        lineAB = a.getDistance(b);
        lineBC = b.getDistance(c);
        lineCD = c.getDistance(d);
        lineDA = d.getDistance(a);

        lineAC = a.getDistance(c);

        return lineAB + lineBC + lineCD + lineDA;
    }

    public double getArea() {
        Triangular triaOne = new Triangular(a, b, c);
        Triangular triaTwo = new Triangular(a, d, c);
        triaOne.getPerimetr();
        triaTwo.getPerimetr();
        return triaOne.getArea() + triaTwo.getArea();
    }
}
