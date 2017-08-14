/**
 * Created by Maximus on 10.08.2017.
 */
public class Triangular extends Shape {
    private Point a;
    private Point b;
    private Point c;

    private double lineAB;
    private double lineBC;
    private double lineCA;

    public Triangular(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular() {
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

    @Override
    public double getPerimetr() {
        lineAB = a.getDistance(b);
        lineBC = b.getDistance(c);
        lineCA = c.getDistance(a);
        return this.lineAB + this.lineBC + this.lineCA;
    }

    @Override
    public double getArea() {
        double polP = (this.lineAB + this.lineBC + this.lineCA) / 2;
        return Math.sqrt(polP * (polP - this.lineAB) * (polP - this.lineBC) * (polP - this.lineCA));
    }
}
