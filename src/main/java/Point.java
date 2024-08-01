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

    public static void main(String[] args) {
        //создание объектов
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(5, 8);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);
        //сравнение объектов в памяти
        System.out.println("Точка 1 == Точка 2: " + (point1 == point2));
        System.out.println("Точка 1 == Точка 3: " + (point1 == point3));
    }

}
