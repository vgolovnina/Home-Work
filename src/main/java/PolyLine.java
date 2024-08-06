import java.util.Arrays;

public class PolyLine {
    private Point[] points;
    public PolyLine() { // Пустой конструктор
        this.points = new Point[0];
    }
    public PolyLine(Point... points) {  // Конструктор с начальным набором точек
        this.points = points;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public Line[] getLines() {
        //if (points.length < 2) return new Line[0]; //проверку чет не докрутила

        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += new Line(points[i], points[i + 1]).getLength();
        }
        return length;
    }

    public static void main(String[] args) {
        // 1
        PolyLine polyLine = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8, 9));
        //2
        System.out.println("Длина ломаной: " + polyLine.getLength());
        //3
        Line[] lines = polyLine.getLines();
        //4
        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + linesLength);
        //5
        System.out.println("Длины совпадают: " + (polyLine.getLength() == linesLength));

        //6
        polyLine.points[1].x = 12;
        System.out.println("Ломаная после изменения: " + polyLine);
        System.out.println("Массив линий после изменения: " + Arrays.toString(polyLine.getLines()));
        lines[0].start.x = 12; // Точка {2,8} стала {12,8} в первой линии
        System.out.println("Изменение точки в первой линии: " + lines[0]);
    }
}
