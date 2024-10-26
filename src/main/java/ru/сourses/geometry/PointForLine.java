package ru.сourses.geometry;

import java.util.Arrays;

class PointForLine { //Так назван, потому что пошел конфликт с предыдущими домашками, пока не хочу перезатирать Point
    double x, y;

    public PointForLine(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PointForLine point = (PointForLine) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(x) + Double.hashCode(y);
    }
}

class PolyLineSecond { //Так назван, потому что пошел конфликт с предыдущими домашками, пока не хочу перезатирать PoliLine
    PointForLine[] points;

    public PolyLineSecond(PointForLine[] points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 1; i < points.length; i++) {
            len1 = points[i].x - points[i - 1].x;
            len2 = points[i].y - points[i - 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLineSecond polyLine = (PolyLineSecond) obj;
        return Arrays.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    public static void main(String[] args) {
        PolyLineSecond polyLine1 = new PolyLineSecond(new PointForLine[]{new PointForLine(3, 7), new PointForLine(1, 2), new PointForLine(7, 8)});
        PolyLineSecond polyLine2 = new PolyLineSecond(new PointForLine[]{new PointForLine(8, 6), new PointForLine(3, 4), new PointForLine(9, 10)});
        PolyLineSecond polyLine3 = new PolyLineSecond(new PointForLine[]{new PointForLine(1, 0), new PointForLine(5, 6), new PointForLine(11, 12)});

        //Сравнение полилиний
        System.out.println("polyLine1.equals(polyLine2): " + polyLine1.equals(polyLine2)); // true
        System.out.println("polyLine1.equals(polyLine3): " + polyLine1.equals(polyLine3)); // false

        //Вывод длины полилинии
        System.out.println("Length of polyLine1: " + polyLine1.length());
    }
}