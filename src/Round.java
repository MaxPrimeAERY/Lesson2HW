/**
 * Created by Maximus on 13.08.2017.
 */
public class Round extends Shape {
    private Point radiusStart;
    private Point radiusEnd;
    private double distRad;

    public Round(Point radiusStart, Point radiusEnd) {
        this.radiusStart = radiusStart;
        this.radiusEnd = radiusEnd;
    }

    public Point getRadiusStart() {
        return radiusStart;
    }

    public void setRadiusStart(Point radiusStart) {
        this.radiusStart = radiusStart;
    }

    public Point getRadiusEnd() {
        return radiusEnd;
    }

    public void setRadiusEnd(Point radiusEnd) {
        this.radiusEnd = radiusEnd;
    }

    @Override
    public double getPerimetr() {
        distRad = radiusStart.getDistance(radiusEnd);
        return 2 * Math.PI * distRad;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radiusStart.getDistance(radiusEnd), 2);
    }
}
