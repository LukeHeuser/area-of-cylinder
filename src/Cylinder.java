public class Cylinder extends Circle{

    private double height;

    public Cylinder (double radius, double height) {
        super(radius);

        if(height < 0) {
            height = 0;
        }
        this.height = height;
    }

    protected double getHeight() {
        return height;
    }

    protected double getVolume() {
        return getArea() * height;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}
