package ru.сourses.geometry;
public class Line {
    //getLenght -- метод расчета линии
    Point start;
    Point end;

    public Line (Point start, Point end){ //конструктор 1
        this.start = start;
        this.end = end;
    }


    public Line (int startX, int startY, int endX, int endY){ //конструктор 2
        this.start = new Point(startX,startY);
        this.end = new Point(endX,endY);
    }


    @Override
    public String toString() {
        return "От " + start + " До " + end;
    }

    public double getLenght(){
        double xDiff = end.x - start.x;
        double yDiff = end.y - start.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }


    public static void main(String[] args){
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        //Line line3 = new Line(5, 8, 10, 11);
        Line line3 = new Line (line2.end, line1.start);

        System.out.println("Линия 3: " + line3);
        //второе задание не совсем поняла, сделала чтобы линия не входила во все координаты
        line3.start.x = 0;
        line3.start.y = 0;
        line3.end.x = 22;
        line3.end.y = 22;

        System.out.println("Линия 3 после изменения: " + line3);
        double allLenght = line1.getLenght() + line2.getLenght() + line3.getLenght();
        System.out.println("Сумма длин трех линий = " + allLenght);

    }

    public double getLength() {
        return 0;
    }
}
