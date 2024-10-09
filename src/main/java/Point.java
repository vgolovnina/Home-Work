public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String getCoordinates() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        // создание объектов
        Point3D point1 = new Point3D(1, 3, 1);
        Point3D point2 = new Point3D(1, 3, 3);
        Point3D point3 = new Point3D(5, 8, 6);

        System.out.println("Точка 1: " + point1.getCoordinates());
        System.out.println("Точка 2: " + point2.getCoordinates());
        System.out.println("Точка 3: " + point3.getCoordinates());

        // сравнение объектов в памяти
        System.out.println("Точка 1 == Точка 2: " + (point1 == point2));
        System.out.println("Точка 1 == Точка 3: " + (point1 == point3));
    }
}
