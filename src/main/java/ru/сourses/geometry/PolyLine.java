package ru.сourses.geometry;

class PolyLine {
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }


    static class ClosedPolyLine extends PolyLine {
        public ClosedPolyLine(Point... points) {
            super(points);
        }

        @Override
        public double length() {
            double totalLength = super.length(); //Длина ломаной (не замкнутой)
            if (points.length > 0) {
                double len1 = points[points.length - 1].x - points[0].x;
                double len2 = points[points.length - 1].y - points[0].y;
                totalLength += Math.sqrt(len1 * len1 + len2 * len2);
            }
            return totalLength;
        }

        public static void main(String[] args) {
            Point p1 = new Point(1, 0);
            Point p2 = new Point(3, 8);
            Point p3 = new Point(6, 4);

            ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);
            System.out.println("Длина замкнутой ломаной: " + closedPolyLine.length());
        }
    }
}