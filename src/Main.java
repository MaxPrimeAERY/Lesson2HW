/**
 * Created by Maximus on 10.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        String perimetr = "Perimetr = ";
        String area = "Area = ";

        Point a = new Point(0, 0);
        Point b = new Point(3, 3);
        Point c = new Point(7, 6);
        Point d = new Point(9, 6);


        Triangular triangular = new Triangular(a, b, c);
        Shape triaSh = triangular;
        System.out.println(perimetr + triaSh.getPerimetr() + "\n" + area + triaSh.getArea());

        Rectangle rectangle = new Rectangle(a, b, c, d);
        Shape rectSH = rectangle;
        System.out.println(perimetr + rectSH.getPerimetr() + "\n" + area + rectSH.getArea());

        Round round = new Round(a, c);
        Shape rouSh = round;
        System.out.println(perimetr + rouSh.getPerimetr() + "\n" + area + rouSh.getArea());

    }
}
