public class Main {

    public static void main(String[] args) {


        Cylinder firstCylinder = new Cylinder(9, 7);

        System.out.println(firstCylinder.getArea());
        System.out.println(firstCylinder.getVolume());
        System.out.println("The volume of a cylinder with a radius of: " + firstCylinder.getRadius() +
                " and a height of: " + firstCylinder.getHeight() + " is " + firstCylinder.getVolume());


        Cylinder secondCylinder = new Cylinder(10, 8945);

        System.out.println(secondCylinder.getArea());
        System.out.println(secondCylinder.getVolume());
        System.out.println("The volume of a cylinder with a radius of: " + secondCylinder.getRadius() +
                " and a height of: " + secondCylinder.getHeight() + " is " +  String.format("%.2f", secondCylinder.getVolume()));

    }

}
