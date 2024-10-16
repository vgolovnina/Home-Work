package ru.сourses.geometry;
interface Measurable {
    double getLength();

    class Line implements Measurable {
        double length;

        public Line(double length) {
            this.length = length;
        }

        @Override
        public double getLength() {
            return length;
        }
    }
    class PolyLine implements Measurable {
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

        @Override
        public double getLength() {
            double sum = 0;
            for (int i = 0; i < points.length - 1; i++) {
                double len1 = points[i].x - points[i + 1].x;
                double len2 = points[i].y - points[i + 1].y;
                sum += Math.sqrt(len1 * len1 + len2 * len2);
            }
            return sum;
        }
    }

    class ClosedPolyLine extends PolyLine {
        public ClosedPolyLine(Point... points) {
            super(points);
        }

        @Override
        public double getLength() {
            double totalLength = super.getLength();
            Point[] points = new Point[0];
            if (points.length > 0) {

                double len1 = points[points.length - 1].x - points[0].x;
                double len2 = points[points.length - 1].y - points[0].y;
                totalLength += Math.sqrt(len1 * len1 + len2 * len2);
            }
            return totalLength;
        }

        public static void printLengths(Measurable[] shapes) {
            for (Measurable shape : shapes) {
                System.out.println("Длина: " + shape.getLength());
            }
        }

        public static void main(String[] args) {
            Line line = new Line(9);
            PolyLine polyLine = new PolyLine(new PolyLine.Point(1, 1), new PolyLine.Point(3, 4), new PolyLine.Point(6, 3));
            ClosedPolyLine closedPolyLine = new ClosedPolyLine(new PolyLine.Point(2, 7), new PolyLine.Point(3, 4), new PolyLine.Point(6, 4));

            Measurable[] shapes = {line, polyLine, closedPolyLine};
            printLengths(shapes);
        }
    }
}