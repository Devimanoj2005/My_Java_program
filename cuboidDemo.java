import java.util.Scanner;

class Cuboid {
    double radius;
    double height;

    void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }

    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class CuboidDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius and height of the cylinder:");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        Cuboid myCuboid = new Cuboid();
        myCuboid.setDimensions(radius, height);

        double volume = myCuboid.calculateVolume();
        double surfaceArea = myCuboid.calculateSurfaceArea();

        System.out.println("Volume of the cylinder: " + volume);
        System.out.println("Surface Area of the cylinder: " + surfaceArea);
    }
}