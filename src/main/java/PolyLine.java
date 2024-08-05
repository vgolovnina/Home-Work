public class PolyLine {
    //getLines массив линий
    //getLenght длина
    Point[] points;

    public PolyLine(Point point, Point point1, Point point2, Point point3){
        this.points = points;
    }

    public String toString(){
        //String s = "Линия ["
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.length; i++){
            //s+=points[i];
            sb.append(points[i]);
            if (i < points.length - 1)
                //s = ",";
                sb.append(",");
        }
        //s = " ] "
        sb.append("]");
        return sb.toString();
    }

    public Line [] getLines(){
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length; i++){
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLenght(){
        double lenght = 0;
        for (int i = 0; i < points.length; i++){
            lenght += new Line(points[i], points[i + 1]).getLenght();
        }
        return lenght;
    }
    public static void main(String[] args){
        //1
        PolyLine polyLine = new PolyLine(new Point(1,5), new Point(2,8), new Point(5,3), new Point(8,9));
        //2
        System.out.println("Длина ломанной: " + polyLine.getLenght());
        //3
        Line lines [] = polyLine.getLines();
        //4
        double lineLenght = 0;
        for (Line line : lines){
            lineLenght += line.getLenght();
        }
        System.out.println("Длина массива линий: " + lineLenght);
        //5
        System.out.println("Сравнение ломанной линии и массива линий" + (polyLine.getLenght() == lineLenght));
        //6




    }

}
