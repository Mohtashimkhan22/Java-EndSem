import java.util.Scanner;

interface Volume {
    void displayVolume();
}

class Cone implements Volume {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void displayVolume() {
        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cone: " + volume);
    }
}

class Hemisphere implements Volume {
    double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayVolume() {
        double volume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Hemisphere: " + volume);
    }
}

class Cylinder implements Volume {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void displayVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

public class q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of cone: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter height of cone: ");
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        cone.displayVolume();

        System.out.print("Enter radius of hemisphere: ");
        double hemisphereRadius = scanner.nextDouble();
        Hemisphere hemisphere = new Hemisphere(hemisphereRadius);
        hemisphere.displayVolume();

        System.out.print("Enter radius of cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        cylinder.displayVolume();

        scanner.close();
    }
}
